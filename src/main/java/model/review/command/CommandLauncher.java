package model.review.command;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-11 9:28
 **/
public class CommandLauncher {
    public static void main(String[] args) {
        Command command = new Speaker();
        Command command1 = new Actor();
        RemoteController controller = new RemoteController();
        // press down
        controller.pressDown(command);
        controller.pressDown(command1);
        // forward
        controller.forward();
        // backward
        controller.backward();
        // forward
        controller.forward();
        // backward
        controller.backward();
        // backward
        controller.backward();
    }
}
