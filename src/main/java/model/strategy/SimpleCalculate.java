package model.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-07 23:07
 **/
public class SimpleCalculate extends Calculator{
    public SimpleCalculate(int x,int y,Algorithm algorithm){
        this.x = x;
        this.y = y;
        this.algorithm = algorithm;
    }
    @Override
    void calcValue() {
        algorithm.calculate(x,y);
    }
}
