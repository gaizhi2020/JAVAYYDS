public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + "; b:" + b);
        changeNum(a, b);
        System.out.println("a:" + a + "; b:" + b);
    }
    public static void changeNum(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
}
