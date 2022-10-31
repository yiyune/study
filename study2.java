package org.example;// Java 프로그래밍 - 변수와 자료형_4

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import static java.lang.Integer.valueOf;

public class study2 {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();


//      1-1. add ( 데이터를 추가 할때 사용)
        l1.add(1);
        l1.add("siyune");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world");
        System.out.println("l1 = " + l1);

        l1.add(0,1);
        System.out.println("l1 = " + l1);


//      1-2. get ( 지정 위치에 어떤 자료가 있는지 확인 할떄 사용 )
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

//      1-3. size ( 변수 안에 몇개의 데이터가 있는지 확인할떄 사용 )
        System.out.println(l1.size());

//      1-4. remove
        System.out.println(l1.remove(0)); // 지정위치에 데이터를 지울떄 사용
        System.out.println("l1 = " + l1);

        System.out.println(l1.remove(Integer.valueOf(4))); // 지정변수 안에 데이터중 원하는 데이터를 지울때 사용
        System.out.println("l1 = " + l1);

//      1-5. clear ( 변수 안에 모든 데이터를 지울떄 사용)
        l1.clear();
        System.out.println("l1 = " + l1);


//      1-6. sort ( 변수안 데이터를 정리할떄 사용)
        ArrayList l2 = new ArrayList();
        l2.add(6);
        l2.add(4);
        l2.add(5);
        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder()); // Comparator.naturalOrder() = 내림차순 정리를 할때 사용)
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder()); // 오름 차순으로 정리할때 사용
        System.out.println("l2 = " + l2);

//      1-7. contains // 변수안에 지정데이터가 있는지 확인할수 있음
        System.out.println(l2.contains(3));
        System.out.println(l2.contains(5));



//      2. Maps // 데이터가 짝을 이루어 저장하는 자료로 순서는 보장되지 않음 다만 키값을 순서가 정해짐
        HashMap map = new HashMap();



//      2-1. put // map 안에 데이터를 넣을때 사용
        map.put("pen",1500);
        map.put("book",2000);
        map.put("note",5000);
        System.out.println("map = " + map);


//      2-2. get // map 안에 있는 데이터중 원하는 값이
        System.out.println(map.get("paper"));
        System.out.println(map.get("note"));


//      2-3. size 변수 안에 몇개의 데이터가 있는지 확인 할떄 사용
        System.out.println(map.size());

//      2-4. remove
        System.out.println(map.remove("pen"));
        System.out.println(map.remove("paper"));
        System.out.println("map = " + map);


//      2-5. containsKey 해당 키값이 맵에 있는지 확인 할떄 사용
        System.out.println(map.containsKey("book"));
        System.out.println(map.containsKey("pen"));




//      3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("wow");
        System.out.println("l3 = " + l3);
        
        ArrayList<String> l4 = new ArrayList<String>();
        //   l4.add(1);
        l4.add("awesom");
        System.out.println("l4 = " + l4);


        HashMap map1 = new HashMap();
        map1.put(123,"ID");
        map1.put("pw",456);
        System.out.println("map1 = " + map1);

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("id",123);
        map2.put("pw",456);
        System.out.println("map2 = " + map2);
        
        HashMap<String,String> map3 = new HashMap<>();
        map3.put("ID","ID");
        map3.put("pw","pw");
        System.out.println("map3 = " + map3);


        HashMap<Integer,String> map4 = new HashMap<>();
        map4.put(123,"ID");
        map4.put(456,"PW");
        System.out.println("map4 = " + map4);


    }

}
