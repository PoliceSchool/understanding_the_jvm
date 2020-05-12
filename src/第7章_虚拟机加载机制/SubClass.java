package 第7章_虚拟机加载机制;

public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}
