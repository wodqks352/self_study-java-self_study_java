package Chap06.sec05.exam04;

public class SingletonExample {
    public static void main(String[] args) {
//        에러
//        Singleton obj1 = new Singleton();

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 객체");
        } else {
            System.out.println("다른 객체");
        }
    }
}