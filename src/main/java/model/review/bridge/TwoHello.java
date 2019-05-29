package model.review.bridge;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-29 8:16
 **/
public class TwoHello implements TwoDimension {
    Onedimension onedimension;

    public TwoHello(Onedimension onedimension) {
        this.onedimension = onedimension;
    }

    @Override
    public void hear() {
        System.out.println("hearing:hello~");
        this.onedimension.say();
    }
}
