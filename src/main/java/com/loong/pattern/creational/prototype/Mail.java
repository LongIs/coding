package com.loong.pattern.creational.prototype;

public class Mail implements Cloneable {
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String emailAddress;
    private String content;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {

        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
