package mdoel.complex.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-09 6:44
 **/
public interface Component {
    void buildPage();
    void addItem(Component component);
}
