package 第7章_虚拟机加载机制.Demo7_3;

import 第7章_虚拟机加载机制.ConstClass;

public class NotInitialization {
    public static void main(String[] args) {
        /**
         * 不会输出“ConstClass init!"
         * 虽然在java源码中引用了ConstClass类中的常量HELLOWORLD
         * 但其实在编译阶段通过常量传播优化，已经将此常量的值"hello world"存储到NotInitialization类的常量池中
         * 以后NotInitialization对常量ConstClass.HELLOWORLD的引用实际都转化为NotInitialization对自身常量池的引用了。
         * 也就是说，实际上NotInitialization的Class文件之中并没有ConstClass类的符号引用入口，这两个类在编译成Class之后就不存在任何练联系了
         *
         * 使用命令：javap -verbose NotInitialization.class，查看字节码文件，
         * 可以看到"hello world"确实存储到NotInitialization类的常量池中
         */
        System.out.println(ConstClass.HELLOWORLD);
    }
}
