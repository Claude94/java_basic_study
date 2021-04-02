package day15.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //Set: 중복 저장 허용X, 순서 없이 빠른 속도로 저장, 전체탐색 속도 빠름
        Set<String> set = new HashSet<>();
        
        //set에 객체 추가: add()
        set.add("김말이");
        set.add("닭강정");
        set.add("단무지");
        set.add("김밥");
        set.add("김말이");
        System.out.println(set.size());
        System.out.println("set = " + set);
        System.out.println("==========================");
        for (String s : set) {
            System.out.println(s);
        }

        //Set의 객체 삭제: remove(obj)
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
        
    }
}
