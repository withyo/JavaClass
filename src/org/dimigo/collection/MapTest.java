package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //2.Map 계열 : HashMap
        //key, value 쌍으로 구성
        //맵은 순서를 중요하게 생각하지 않음. key 값이 중요!
        Map<String, Integer> map = new HashMap<>();
        map.put("kor",100);
        map.put("mat",90);
        map.put("eng",80);
        map.put("eng",90); //나중에 추가한게 업데이트 됨
        printMap(map);

        System.out.println(map.get("kor")); //100
        System.out.println(map.get("sci")); //null

        map.remove("eng");
        printMap(map);

        map.clear(); //전체 다 삭제

        //Map : key(String), value(List<String>)
        Map<String, List<String>> map2 = new HashMap<>();


        //List : Map<String, String>
        List<Map<String, String>> list = new ArrayList<>();
    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()){
            System.out.println(key + ":" + map.get(key) + "|");
        }
        System.out.println();
    }

}
