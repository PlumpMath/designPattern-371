package com.zy.designpattern.Observer.observer;

/**
 * @autor cgl
 * @time 2016/9/5.
 * 作用: 观察者展示自己的信息接口，每个观察者也要实现该接口
 */
public interface DisplayElement {
    /**
     * 观察者通过此方法显示自己的状态，在更新状态后可调用此方法
     */
    public void display();
}
