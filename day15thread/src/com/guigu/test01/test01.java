package com.guigu.test01;

import java.util.Arrays;

/**
 * {DAY}
 * 周一
 * WangYakun
 *
 */
public class test01 {
    public void test02(){
        int[] Arr = {10,20,30};
        int[] newArr = new  int[3];
        System.arraycopy(Arr,1,newArr,0,2);
        System.out.println(Arrays.toString(newArr));
       // System.out.println("newArr = " + newArr);
        System.exit(1);//强制退出jvm，
    }
}
