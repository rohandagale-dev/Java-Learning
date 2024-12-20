public class Variables {
    public static void main() {
        int num = 8;
        System.out.println("size of Number = " + num + ": 4 Bytes");

        String name = "John";
        System.out.println("size of String = " + name + ": 2 Bytes per char");

        Short sh = 3000;
        System.out.println("size of Short = " + sh + ": 2 Bytes");

        Long lg = 10000000000L;
        System.out.println("size of Long = " + lg + ": 8 Bytes");

        Float fl = 3.14f;
        System.out.println("size of Float = " + fl + ": 4 Bytes");

        Double db = 3.14159;
        System.out.println("size of Double = " + db + ": 8 Bytes");

        Character ch = 'A';
        System.out.println("size of Char = " + ch + ": 2 Bytes");

        Boolean bl = true;
        System.out.println("size of Boolean = " + bl + ": 1 Bytes");
    }
}
