/**
 * {DAY}
 * 字符串的交换
 * 周一
 * WangYakun
 */
public class changeValueTest02 {
    public static void main(String[] args) {
        String[] arr = {"罗念","王亚昆"};
        System.out.println("交换前"+arr[0]+"，交换前y"+arr[1]);
        changeValue(arr);
        System.out.println("交换后x"+arr[0]+"，交换后y"+arr[1]);
    }
    public static void changeValue(String[] arr){
        arr[0] = "韩红";
        arr[0] = arr[1];
        arr[1] = arr[0];
        System.out.println("交换中x"+arr[0]+"，交换中y"+arr[1]);
    }
}