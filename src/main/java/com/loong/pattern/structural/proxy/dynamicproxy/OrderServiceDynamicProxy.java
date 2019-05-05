package com.loong.pattern.structural.proxy.dynamicproxy;

import com.loong.pattern.structural.proxy.Order;
import com.loong.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by geely
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        /*1、loader，指定代理对象的类加载器；
          2、interfaces，代理对象需要实现的接口，可以同时指定多个接口；
          3、handler，方法调用的实际处理者，代理对象的方法调用都会转发到这里（*注意1）。

          newProxyInstance()会返回一个实现了指定接口的代理对象，
          对该对象的所有方法调用都会转发给InvocationHandler.invoke()方法。
        */
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }


    /**
     * 动态代理神奇的地方就是：
     *  代理对象是在程序运行时产生的，而不是编译期；
     *  对代理对象的所有接口方法调用都会转发到InvocationHandler.invoke()方法，
     *  在invoke()方法里我们可以加入任何逻辑，比如修改方法参数，加入日志功能、安全检查功能等；
     *  之后我们通过某种方式执行真正的方法体，示例中通过反射调用了Hello对象的相应方法，还可以通过RPC调用远程方法。
     *
     *  但Java动态代理是基于接口的，如果对象没有实现接口，我们只能使用CGLIB动态代理方式登场。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before code");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
