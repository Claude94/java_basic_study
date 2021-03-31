package day13.api.lang.obj;

public class Menber {

    String name;
    int age;
    String address;

    public Menber(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
//    public String toString() {
////        return "이름: " + this.name + "나이: " + age + "주소: " + address;
//        return String.format("이름: %s, 나이: %d세, 주소: %s", name, age, address);
//    }

    @Override
    public String toString() {
        return "Menber{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


}