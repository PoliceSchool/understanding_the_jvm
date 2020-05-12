package 第7章_虚拟机加载机制.Demo7_2;

import 第7章_虚拟机加载机制.SuperClass;

public class NotInitialization {
    public static void main(String[] args) {
        /**
         * 没有输出“SuperClass init！”
         * 说明并没有触发SuperClass的初始化。
         *
         */
        SuperClass[] sca = new SuperClass[10];
    }
}
