package model.observe;

import java.util.ArrayList;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-03 23:05
 **/
public class DataGenerator implements ITheme{
    private ArrayList<IObserve> observeList = new ArrayList<IObserve>();

    public void register(IObserve iObserve) {
        this.observeList.add(iObserve);
    }

    public void remove(IObserve iObserve) {
        this.observeList.remove(iObserve);
    }

    public void notifyObserves() {
        for(IObserve ob:this.observeList){
            ob.update();
        }
    }
}
