/*  Memory Area	Description
Stack =	Used for storing local variables, method calls, and primitive data types.
Heap =  Used for storing objects,arrays,and class instances.
*/

public class Stack_Heap {
    String name;
    int age;

    public Stack_Heap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        int a = 5; // stored in stack
        System.err.println(a);

        Stack_Heap obj = new Stack_Heap("Rohan", 21); // Reference stored in stack, object in heap
        System.out.println(obj.age);

        String name = new String("John"); // "John" is stored in the Heap
        System.out.println(name);
    }

}