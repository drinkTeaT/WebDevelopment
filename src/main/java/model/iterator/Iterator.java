package model.iterator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-10 13:33
 **/
public interface Iterator {
    boolean hasNext();
    Object first();
    Object nextOne();
}
