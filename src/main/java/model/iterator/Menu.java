package model.iterator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-10 13:52
 **/
public class Menu {
    private Meat[] meats;
    public void setMeat(Meat[] meats){
        this.meats = meats;
    }
    public void showMeats(){
        System.out.println(this.meats);
    }
    public Iterator creatIterator(){
        return new MeatIterator(meats);
    }
}
