package com.zy.designpattern.Observer.observer;

/**
 * @autor cgl
 * @time 2016/9/5.
 * 作用: 观察者模式 中 观察者 接口，实现该接口的就是观察者
 */
public interface Observer {
    /**
     *  观察者观察到主题的变化后，调用此方法来更新自己的状态
     * @param temp  温度
     * @param humi  湿度
     * @param pressure 气压
     */
    public void update(float temp,float humi,float pressure);
}
