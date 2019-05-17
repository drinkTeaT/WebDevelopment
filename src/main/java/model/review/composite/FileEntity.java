package model.review.composite;

/**
 * @Description：具体的文件
 * @Author： Administrator
 * @Date： 2019-05-08 21:08
 **/
public class FileEntity extends FileManager {
    private String info;

    public FileEntity(String info) {
        this.info = info;
    }

    @Override
    public void info() {
        System.out.println(info);
    }
}
