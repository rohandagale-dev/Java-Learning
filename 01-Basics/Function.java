public class Function {

    public static int addNum(int a, int b) {
        return a * b;
    }

    // pass by value
    public static int passByValue(int a) {
        return a + 1;
    }

    public static void main(String[] args) {
        int result = addNum(2, 2);
        System.out.println(result);

        int num = 5;
        int result1 = passByValue(5);
        System.out.println(result1);
        System.out.println(num);
    }
}
