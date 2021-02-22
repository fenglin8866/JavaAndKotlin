package demo;

public class MJFrame {
    /*public final String name;
    public static int age;
    public void test(){
        name="jjjj";
        name="xxxxx"
    }*/
    public static int num = 10;

    public static int change(int num) {
        num = 15;
        System.out.println("change = " + num);
        return num;
    }

    public static void main(String[] args) {
        System.out.println(change(num));
        System.out.println(num);
    }
}
