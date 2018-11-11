package mdoel.complex.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-09 6:52
 **/
public class Launcher {
    public static void main(String[] args){
        Component component = new Adapter();
        component = new ButtonAdapter(component);
        component.buildPage();
    }
}
