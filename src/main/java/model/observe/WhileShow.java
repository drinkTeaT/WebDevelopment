package model.observe;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-03 23:18
 **/
public class WhileShow implements IObserve {
    public WhileShow(ITheme iTheme){
        iTheme.register(this);
    }
    public void update() {
        System.out.println("white Show");
    }
}
