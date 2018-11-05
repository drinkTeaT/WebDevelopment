package pattern.observe;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-05 22:33
 **/
public class TomFamily implements Client {
    public TomFamily(Publisher publisher){
        publisher.addItems(this);
    }
    public void update(String str) {
        System.out.println(str);
    }
}
