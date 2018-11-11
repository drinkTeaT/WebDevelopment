package model.factory;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-06 22:44
 **/
public abstract class Product {
    public void choose(){
        System.out.println("use");
    }
    abstract void showDetail();
}
