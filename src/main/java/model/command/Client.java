package model.command;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-05 23:08
 **/
public class Client {
    public static void main(String[] args){
        Trigger trigger = new Trigger();
        Door door = new Door();
        Command command = new Open(door);

        trigger.setCommand(command);
        trigger.pressButton();
    }
}
