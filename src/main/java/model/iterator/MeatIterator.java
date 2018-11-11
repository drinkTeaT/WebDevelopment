package model.iterator;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-10 13:49
 **/
public class MeatIterator implements Iterator{
    private Meat[] meats;
    private int i;
    public MeatIterator(Meat[] meats){
        this.meats = meats;
        this.i = 0;
    }
    @Override
    public boolean hasNext() {
        int size = meats.length;
        return size == i+1 ? false : true;
    }

    @Override
    public Object first() {
        Meat meat = meats[0];
        return meat;
    }

    @Override
    public Object nextOne() {
        Meat meat = meats[i+1];
        i += 1;
        return meat;
    }
}
