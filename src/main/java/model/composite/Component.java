package model.composite;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-10 15:04
 **/
public interface Component {
    void operation();
    void add(Component component);
    void remove(Component component);
}
