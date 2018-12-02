package model.decorator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-12-02 11:02
 **/
public class Pants extends Accessories{

    public Pants(Decorator decorator){
        super(decorator);
    }

    @Override
    public void putSth() {
        decorator.putSth();
        System.out.println("put pants");
    }
}
