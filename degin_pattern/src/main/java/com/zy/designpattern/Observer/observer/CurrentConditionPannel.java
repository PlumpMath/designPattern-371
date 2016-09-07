package com.zy.designpattern.Observer.observer;

import com.zy.designpattern.Observer.suject.Subject;

/**
 * @autor cgl
 * @time 2016/9/5.
 * 作用: 当前温度和湿度面板，模拟气象站
 */
public class CurrentConditionPannel implements  Observer,DisplayElement {
    private Subject subject;//观察者持有主题引用
    private float temp;
    private float humi;
    public CurrentConditionPannel(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);//把当前观察者注册到主题中
    }

    /**
     * 取消观察该主题
     */
    public void remocveFromSuject(){
        subject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度："+temp+"  当前湿度："+humi);
    }

    @Override
    public void update(float temp, float humi, float pressure) {
        this.setTemp(temp);
        this.setHumi(humi);
        display();
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumi() {
        return humi;
    }

    public void setHumi(float humi) {
        this.humi = humi;
    }
}
