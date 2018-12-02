package model.decorator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-12-02 11:15
 **/
public class Launcher {
    public static void main(String[] args){
        Decorator decorator = new Puppy();
        Decorator accessories1 = new Clothes(decorator);
        Decorator accessories = new Pants(accessories1);
        accessories.putSth();
    }
}
