package com.loong.pattern.behavioal.state.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-15 21:07
 */
public interface State {
    /**
     * @desc 预订房间
     * @return void
     */
    void bookRoom();

    /**
     * @desc 退订房间
     * @return void
     */
    void unsubscribeRoom();

    /**
     * @desc 入住
     * @return void
     */
    void checkInRoom();

    /**
     * @desc 退房
     * @return void
     */
    void checkOutRoom();
}
