package model.review.command;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-11 9:28
 **/
public class Actor implements Command {
    @Override
    public void execute() {
        System.out.println("dancing");
    }
}
