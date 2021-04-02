package day15.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class MapExample {
    public static void main(String[] args) {

        //Map: key, value의 쌍으로 데이터를 집합관리, key는 중복 불가능, value는 중복가능
        Map<String, Member> memberMap = new HashMap<>();

        //Map에 객체 추가: put(key, value)
        memberMap.put("멍멍이",new Member("김철수", 30));
        memberMap.put("야옹이",new Member("고길동", 45));
        memberMap.put("짹짹이",new Member("박영희", 30));

//        System.out.println("memberMap = " + memberMap);
        //이미 저장된 key로 새롭게 put하면 value가 수정됨
        memberMap.put("야옹이", new Member("둘리", 10));
        System.out.println(memberMap);

        System.out.println(memberMap.size());
        //Map에 저장된 객체 참조: get(key)
        Member kim = memberMap.get("멍멍이");
        System.out.println(kim.name);

        //Map에 저장된 키의 유무 확인
        System.out.println(memberMap.containsKey("까치"));
        System.out.println(memberMap.containsKey("야옹이"));

        //Map 내부객체 삭제 : remove(key)
        memberMap.remove("멍멍이");
        System.out.println(memberMap);

        System.out.println("================================");

        //Map의 반복문 처리
        //Map은 KeySet()메서드는 저장된 키만 추출하여 set 컬렉션에 담아 리턴
        Set<String> keys = memberMap.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(memberMap.get(key));
        }
    }
}
