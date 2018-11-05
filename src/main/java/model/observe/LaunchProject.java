package model.observe;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-03 23:30
 **/
public class LaunchProject {
    public static void main(String[] args){
        DataGenerator dataGenerator = new DataGenerator();
        BlackShow blackShow = new BlackShow(dataGenerator);
        WhileShow whileShow = new WhileShow(dataGenerator);
        dataGenerator.notifyObserves();
    }
}
