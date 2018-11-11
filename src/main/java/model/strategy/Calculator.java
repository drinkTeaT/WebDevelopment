package model.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-07 23:01
 **/
public abstract class Calculator {
    int x;
    int y;
    Algorithm algorithm;
    abstract void calcValue();
}
