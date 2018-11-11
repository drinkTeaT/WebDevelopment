package model.iterator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-10 14:16
 **/
public class Launcher {
    public static void main(String[] args){
        Meat pork = new Meat("pork",14);
        Meat beef = new Meat("beef",40);
        Meat mutton = new Meat("mutton",35);
        Menu menu = new Menu();
        menu.setMeat(new Meat[]{pork,beef,mutton});
        Iterator iterator = menu.creatIterator();
        while (iterator.hasNext()){
            Meat meat = (Meat)iterator.nextOne();
            System.out.println(meat.getName()+"\t"+meat.getPrice());
        }
    }
}
