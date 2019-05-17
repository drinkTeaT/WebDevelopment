package model.review.proxy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-07 22:52
 **/
public class ProxyLauncher {
    public static void main(String[] args) {
        Car bus = new BusProxy();
        bus.run();
    }
}
