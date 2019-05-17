package model.review.composite;

/**
 * @Description：文件和目录要继承的抽象类
 * @Author： Administrator
 * @Date： 2019-05-08 21:05
 **/
public abstract class FileManager {
    public abstract void info();
    public void addFile(FileManager fileManager){};
    public void deleteFile(FileManager fileManager){};
}
