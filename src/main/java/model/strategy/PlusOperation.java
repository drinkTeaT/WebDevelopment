package model.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-07 23:05
 **/
public class PlusOperation implements Algorithm{
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
