package com.zy.designpattern.Observer.suject;

import com.zy.designpattern.Observer.observer.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

/**
 * @autor cgl
 * @time 2016/9/5.
 * 作用: 主题实现类，在观察者模式作为主题,该测试不是线程安全
 */
public class WeatherDate extends Observable implements Subject {
    private List<Observer> observers;
    private float temp;//温度
    private float humi;//湿度
    private float pressure;//气压

    public WeatherDate() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 在主题中添加观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer) {
        if (observer == null) { //处理空异常
            throw new NullPointerException();
        }
        //避免添加重复的观察者，多线程下仍然不能避免
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /**
     * 从主题中移出某个观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);//返回观察者在list中的索引位置。如果存在则返回-1
        if (index > -1) {
            observers.remove(observer);
        }
    }

    /**
     * 主题状态发生改变后，通知所有观察者
     */
    public void notifyObservers() {
        observers.forEach(o -> o.update(temp, humi, pressure));
    }

    /**
     * 通知观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 改变状态，并通知观察者
     */
    public void setMesage(float temp, float humi, float pressure) {
        this.setHumi(humi);
        this.setTemp(temp);
        this.setPressure(pressure);//修改自身状态
        measurementsChanged(); //通知观察者
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

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
