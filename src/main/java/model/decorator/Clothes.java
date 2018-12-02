package model.decorator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-12-02 11:13
 **/
public class Clothes extends Accessories {

    public Clothes(Decorator decorator){
        super(decorator);
    }

    @Override
    public void putSth() {
        decorator.putSth();
        System.out.println("put clothes");
    }
}
