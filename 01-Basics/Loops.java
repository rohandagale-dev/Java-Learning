public class Loops {

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };

        // For loop
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println();

        // while loop
        int i = 0;
        while (i < num.length) {
            System.out.print(num[i]);
            i++;
        }
        System.out.println();

        // do while
        int a = 0;
        do {
            System.out.print(num[a]);
            a++;
        } while (a < num.length);
        System.out.println();

        // for each
        for (int arg : num) {
            System.out.print(arg);
        }
    }
}
