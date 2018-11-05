package pattern.observe;

import java.util.ArrayList;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-05 22:30
 **/
public class Newspaper implements Publisher {
    private ArrayList<Client> clients;
    public Newspaper(){
        clients = new ArrayList<Client>();
    }
    public void addItems(Client client) {
        clients.add(client);
    }

    public void removeItems(Client client) {
        clients.remove(client);
    }

    public void notifyItems() {
        for (Client client:clients){
            client.update(client.hashCode()+"");
        }
    }
}
