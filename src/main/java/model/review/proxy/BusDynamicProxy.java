package model.review.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-07 23:02
 **/
public class BusDynamicProxy implements InvocationHandler {
    Object proxy;

    public BusDynamicProxy(Object obj) {
        proxy = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("heared u are running");
        Object object = method.invoke(this.proxy, args);
        return object;
    }
}
