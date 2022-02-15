package var;

/**
 * {DAY}
 * 周一
 * WangYakun
 * 使用final修饰的变量，值不能在改变。
 * 静态变量，成员变量  局部变量，
 * 1.代码的位置不同，
 * 2.内存位置不同
 * 生命周期不同
 * 是否有默认值
 * 作用域不同。
 */
public class changeValueTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 66;
        point.y = 88;
        System.out.println("交换前x"+point.x+"，交换前y"+point.y);
        changeValue(point);
        System.out.println("交换后x"+point.x+"，交换后y"+point.y);
    }
    public static void changeValue(Point point){
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
        System.out.println("交换中x"+point.x+"，交换中y"+point.y);
    }
}
class Point {
    public int x;
    public int y;
}
