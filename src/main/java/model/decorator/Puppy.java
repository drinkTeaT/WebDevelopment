package model.decorator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-12-02 10:59
 **/
public class Puppy implements Decorator{
    @Override
    public void putSth() {
        System.out.println("here is a puppy");
    }
}
