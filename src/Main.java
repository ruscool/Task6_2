

public class Main {
    public static void main(String[] args) {
        // Задание 6.2.1
        printNumberTask("6.2.1"); // method DRY
        StreamExample.runExample();

        // Задание 6.2.2
        printNumberTask("6.2.2");
        StudentExample.runExample();
    }

    static void printNumberTask(String task) {
        System.out.println();
        System.out.println("Задание " + task);
    }
}