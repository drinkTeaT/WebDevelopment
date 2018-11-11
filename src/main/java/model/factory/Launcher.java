package model.factory;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-06 23:12
 **/
public class Launcher {
    public static void main(String[] args){
        Factory factory = new ToyFactory();
        Product product = factory.factoryMethod("bear");
        product.showDetail();
    }
}
