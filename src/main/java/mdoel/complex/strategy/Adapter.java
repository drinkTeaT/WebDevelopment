package mdoel.complex.strategy;

import model.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-09 6:45
 **/
public class Adapter implements Component {
    VirtualPanel virtualPanel;
    List<Component> list;
    public Adapter(){
    this.virtualPanel = new VirtualPanel();
    }

    @Override
    public void buildPage() {
        virtualPanel.showItem();
        list = new ArrayList<>();
    }

    @Override
    public void addItem(Component component) {
        list.add(component);
    }
}
