package model.observe;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-03 23:04
 **/
public interface ITheme {
    public void register(IObserve iObserve);
    public void remove(IObserve iObserve);
    public void notifyObserves();
}
