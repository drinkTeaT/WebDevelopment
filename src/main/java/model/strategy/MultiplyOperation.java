package model.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-07 23:06
 **/
public class MultiplyOperation implements Algorithm{
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}
