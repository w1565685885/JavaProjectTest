package atguigu.test;
import atguigu.review.Student;

public class SmallStudent extends Student {

    static {
        System.out.println("666666");
    }
    public String name ="2SmallStudent";


    public void showInfo(){
        String name = "1showInfo";
        System.out.println(name);//就近一致
        System.out.println(this.name); //当前对象的name
        System.out.println(super.name);//从父亲继承过来的name
    }


    private String hobby;

    public SmallStudent() {
    }

    public SmallStudent(String hobby){
        this.hobby = hobby;
    }

    public SmallStudent(String name, int age, double height, String sex, String hobby) {
        super(name, age, height, sex);
        this.hobby = hobby;
    }


    public static void show(){
        System.out.println("this is show()");
    }

    public void info(){

        System.out.println(this.hobby);
    }







}
