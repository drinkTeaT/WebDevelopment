package pattern.observe;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-05 22:39
 **/
public class ObserveMain {
    public static void main(String[] args){
        Publisher publisher = new Newspaper();
        Client client = new TomFamily(publisher);
        client = new TomFamily(publisher);
        client = new TomFamily(publisher);
        client = new TomFamily(publisher);
        client = new TomFamily(publisher);
        publisher.notifyItems();
    }
}
