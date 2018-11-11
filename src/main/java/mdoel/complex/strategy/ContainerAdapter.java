package mdoel.complex.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-09 21:54
 **/
public class ContainerAdapter extends Decorator{
    private VirtualPanel virtualPanel;
    public ContainerAdapter(Component component){
        this.component = component;
    }
    @Override
    public void buildPage() {

    }
    @Override
    public void addItem(Component component){
        component.addItem(this);
    }
}
