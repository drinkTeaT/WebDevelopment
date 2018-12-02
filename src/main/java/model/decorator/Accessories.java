package model.decorator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-12-02 11:01
 **/
public abstract class Accessories implements Decorator{
    protected Decorator decorator;

    public Accessories(Decorator decorator){
        this.decorator = decorator;
    }
}
