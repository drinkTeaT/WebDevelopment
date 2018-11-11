package model.command;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-05 22:59
 **/
public class Trigger {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.excute();
    }

    public void undoButton(){
        command.undo();
    }
}
