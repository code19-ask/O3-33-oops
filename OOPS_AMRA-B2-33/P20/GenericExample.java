package P20;
public class GenericExample {
    public static void printArray(String[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);
        String[] strArray = {"Apple", "Banana", "Cherry"};
        System.out.println("\nString Array:");
        printArray(strArray);
        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("\nDouble Array:");
        printArray(doubleArray);
    }
}
