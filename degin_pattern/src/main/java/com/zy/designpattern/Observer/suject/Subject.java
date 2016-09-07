package com.zy.designpattern.Observer.suject;

import com.zy.designpattern.Observer.observer.Observer;

/**
 * @autor cgl
 * @time 2016/9/5.
 * 作用: 观察者模式中，主题 接口。观察者模式适用于一对多关系中
 * 一个主题可以有多个观察者
 */
public interface Subject {
    /**
     * 把观察者注册到主题
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 从主题中移出某个观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 一旦主题中的状态发生改变，就调用此方法通知所有的观察者
     */
    public void notifyObservers();
}
