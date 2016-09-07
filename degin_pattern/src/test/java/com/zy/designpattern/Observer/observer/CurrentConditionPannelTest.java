package com.zy.designpattern.Observer.observer;

import com.zy.designpattern.Observer.suject.Subject;
import com.zy.designpattern.Observer.suject.WeatherDate;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @autor cgl
 * @time 2016/9/5.
 * 作用:
 */
public class CurrentConditionPannelTest {
   @Test
    public void testObserver(){
       WeatherDate weatherDate=new WeatherDate();
       CurrentConditionPannel pannel=new CurrentConditionPannel(weatherDate);
       weatherDate.setMesage(15,35,1000);
       weatherDate.setMesage(15,35,1000);
   }


}