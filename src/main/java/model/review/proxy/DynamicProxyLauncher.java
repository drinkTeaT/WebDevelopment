package model.review.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-07 23:05
 **/
public class DynamicProxyLauncher {
    public static void main(String[] args) {
        Bus bus = new Bus();
        InvocationHandler handler = new BusDynamicProxy(bus);
        Car car = (Car) Proxy.newProxyInstance(bus.getClass().getClassLoader(), bus.getClass().getInterfaces(), handler);
        car.run();
        System.out.println(car.price());
    }
}
