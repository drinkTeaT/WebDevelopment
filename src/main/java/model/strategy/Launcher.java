package model.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-07 23:11
 **/
public class Launcher {
    public static void main(String[] args){
        Map<String,Algorithm> map = new HashMap<>();
        map.put("plus",new PlusOperation());
        map.put("multiply",new MultiplyOperation());
        int value = map.get("multiply").calculate(12,14);
        System.out.println(value);
    }
}
