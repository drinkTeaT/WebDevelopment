package model.command;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-05 23:00
 **/
public class Open implements Command {
    private Door door;
    public Open(Door door){
        this.door = door;
    }
    public void excute() {
        System.out.println("excute below");
        door.open();
    }

    public void undo() {
        door.close();
    }
}
