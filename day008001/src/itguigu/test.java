package itguigu;

/**
 * {DAY}
 * 周三
 * WangYakun
 * 可变形参，参数的个数可以使任意个，【0，，n】；
 * 如何声明可变形参。方法声明处，形参位置，（数据类型...标识符）
 * public static void sum (int...标识符)
 * 注意：可变形参采用数组存储实参
 * 2.可变参数只能位于参数列表的最后。所以一个方法可变参数只能有一个，且必须位于参数列表的最后。
 *
 */
public class test {
    public static void main(String[] args) {
        sum(10,20,30);
        sum(50,60,70,80,90,100);
        sum2(3.14,20,50,60);
    }

    static void sum(int...a){
        //System.out.println("该方法被调用了");
        //System.out.println(a);
        int sum_result = 0;
        for (int i = 0; i < a.length; i++) {
            sum_result = sum_result+a[i];
        }
        System.out.println(sum_result);
    }
    static void sum2(double d1,int...a){
        double sum = 0;
        for (int i : a) {
            sum+=i;
        }
        sum+=d1;
        System.out.println(sum);
    }
    /*private static void sum(int i, int i1, int i2, int i3, int i4, int i5) {

    }

    static void sum(int i, int i1, int i2) {
         System.out.println(i+i1+i2);
    }

     */
}
