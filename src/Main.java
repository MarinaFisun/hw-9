public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        System.out.println("Task 1");
        int[] arr = new int[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;

        double [] secondArr = {1.57d, 7.654d, 9.986d};

        int [] random = {14, 75, 24, 8, 3, 0};
    }
    public static void task2() {
        System.out.println("Task 2");
        int[] arr = new int[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        double [] secondArr = {1.57d, 7.654d, 9.986d};
        int [] random = {14, 75, 24, 8, 3, 0};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr [i]);
            if (i != secondArr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < random.length; i++) {
            System.out.print(random [i]);
            if (i != random.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}