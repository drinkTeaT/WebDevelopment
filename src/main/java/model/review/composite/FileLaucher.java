package model.review.composite;

/**
 * @Description：组合模式类似于树形结构，可以用于构建目录等树状结构
 * @Author： Administrator
 * @Date： 2019-05-08 21:15
 **/
public class FileLaucher {
    public static void main(String[] args) {
        FileManager root = new FileFolder("根目录");
        FileManager Level_1 = new FileFolder("第一层_1");
        FileManager Level_2 = new FileFolder("第一层_2");
        FileManager file_1 = new FileEntity("第一层_pdf文件");
        FileManager file_2 = new FileEntity("第一层_word文件");
        FileManager file_2_1 = new FileEntity("第二层_视频文件");
        root.addFile(file_1);
        root.addFile(file_2);
        root.addFile(Level_1);
        root.addFile(Level_2);
        Level_1.addFile(file_2_1);
        // 打印出文件夹下的文件
        root.info();
    }
}
