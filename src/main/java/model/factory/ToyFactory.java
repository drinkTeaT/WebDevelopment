package model.factory;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-06 22:50
 **/
public class ToyFactory extends Factory {
    public Product factoryMethod(String type) {
        switch (type) {
            case "bear":
                return new ToyBear();
                default:return null;
        }
    }
}
