package mdoel.complex.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-09 6:41
 **/
public class VirtualPanel {
    private List<VirtualButton> list;
    public VirtualPanel(){
        this.list = new ArrayList<>();
    }

    public void addItem(VirtualButton virtualButton){
        list.add(virtualButton);
    }

    public void showItem(){
        System.out.println(list);
    }
}
