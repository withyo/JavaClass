package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ListText {
    public static void main(String[] args) {
        // 1. list 계열 : Arayy
//        List lisst = new ArrayList();
//        ListText = new ArrayList<>();
//        list.add("100");
//        list.add("Dog");String s
//         String s = (String)list.get(0);

    // 제네릭 (Generic)
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");
        printlist(list);

        list.set(2,"바나나");
        printlist(list);

        System.out.println(list.get(0)); //첫번째꺼 꺼내기
        System.out.println(list.get(list.size()-1)); //마지막꺼 꺼내기


        list.remove(0);//첫번째꺼 지우기 -> 나머지 것들 앞으로 한칸씩 당겨짐
        printlist(list);

        list.remove("딸기"); // -> 첫번째 딸기 지워지고
        printlist(list);

        list.clear(); //전체 다 비우기

    }

    private static void printlist(List<String> list){
        for(String value : list){
            System.out.println(value+"|");
        }
        System.out.println();
    }

}
