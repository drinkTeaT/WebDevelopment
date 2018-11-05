package pattern.observe;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-05 22:29
 **/
public interface Publisher {
    public void addItems(Client client);
    public void removeItems(Client client);
    public void notifyItems();
}
