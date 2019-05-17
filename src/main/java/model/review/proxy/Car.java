package model.review.proxy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-07 22:52
 **/
public interface Car {
    void run();

    int price();
}

class Bus implements Car {

    @Override
    public void run() {
        System.out.println("bus runs at 30km/h");
    }

    @Override
    public int price() {
        return 1000;
    }
}

class Wagon implements Car {

    @Override
    public void run() {
        System.out.println("wagon runs at 20km/s");
    }

    @Override
    public int price() {
        return 500;
    }
}
