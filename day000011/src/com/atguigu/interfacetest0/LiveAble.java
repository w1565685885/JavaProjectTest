package com.atguigu.interfacetest0;

/**
 * {DAY}
 * 周三
 * WangYakun
 */
public interface LiveAble {
    void eat();
    void breathe();
    default void sleep(){};
    static void drink(){};

}
