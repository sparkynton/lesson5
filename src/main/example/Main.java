package example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<YourClass> set = new HashSet<>();
        set.add(new YourClass(1, "description"));
        //остальные методы по работе со множествами

        List<YourClass> list = new ArrayList<>();
        list.add(new YourClass(1, "description"));
        //остальные методы по работе со списками

        Map<Integer, YourClass> map = new HashMap<>();
        map.put(1, new YourClass(1, "description"));
        YourClass yourClass = new YourClass(2, "description");
        map.put(yourClass.getObjectId(), yourClass);
        //остальные методы по работе с картами
    }
}
