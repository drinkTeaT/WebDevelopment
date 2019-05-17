package model.review.proxy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-07 22:55
 **/
public class BusProxy implements Car {
    private Bus bus;

    public BusProxy() {
        bus = new Bus();
    }

    @Override
    public void run() {
        System.out.println("bus starts..");
        bus.run();
    }

    @Override
    public int price() {
        return bus.price();
    }
}
