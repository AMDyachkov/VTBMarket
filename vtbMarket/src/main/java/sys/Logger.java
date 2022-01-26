package sys;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


public class Logger implements BeanPostProcessor {
    public void log(Object o){
        System.out.println(o.toString());
    }
}
