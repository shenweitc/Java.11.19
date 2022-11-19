package MyMap_19;

import com.sun.javafx.collections.MappingChange;
import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //1.创建Map集合的对象
        Map<String, String> map=new HashMap<>();
        //2.添加元素
        map.put("yihao","一号");
        map.put("erhao","二号");
        map.put("snahao","三号");
        //3.通过键找值
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+" = "+value);
        }
    }
}
