package model.review.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：文件夹
 * @Author： Administrator
 * @Date： 2019-05-08 21:10
 **/
public class FileFolder extends FileManager {
    private String info;
    private List<FileManager> fileList = new ArrayList<>();

    public FileFolder(String info) {
        this.info = info;
    }

    @Override
    public void info() {
        System.out.println(info);
        fileList.stream().forEach(FileManager::info);
    }

    @Override
    public void addFile(FileManager fileManager) {
        fileList.add(fileManager);
    }

    @Override
    public void deleteFile(FileManager fileManager) {
        fileList.remove(fileManager);
    }
}
