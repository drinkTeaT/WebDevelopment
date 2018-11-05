package model.observe;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-03 23:18
 **/
public class BlackShow implements IObserve {
    public String name = "black cat";
    public BlackShow(ITheme iTheme){
        iTheme.register(this);
    }
    public void update() {
        System.out.println("Black Show");
    }
}
