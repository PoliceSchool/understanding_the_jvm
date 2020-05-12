package 第7章_虚拟机加载机制;

public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}
