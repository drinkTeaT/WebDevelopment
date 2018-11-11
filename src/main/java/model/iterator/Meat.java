package model.iterator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-10 14:04
 **/
public class Meat implements Food{
    private String name;
    private int price;
    public Meat(String name,int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
