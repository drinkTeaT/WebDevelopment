package mdoel.complex.strategy;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-09 6:49
 **/
public class ButtonAdapter extends Decorator {
    private VirtualButton virtualButton;

    public ButtonAdapter(Component component){
        virtualButton = new VirtualButton();
        this.component = component;
    }

    @Override
    public void buildPage() {
        component.buildPage();
        virtualButton.showName();

    }
}
