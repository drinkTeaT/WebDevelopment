package model.review.command;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-11 9:26
 **/
public class Speaker implements Command {
    @Override
    public void execute() {
        System.out.println("hello ula");
    }
}
