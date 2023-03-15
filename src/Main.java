import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] secondArr = {1.57d, 7.654d, 9.986d};

        int[] random = {14, 75, 24, 8, 3, 0};
    }

    public static void task2() {
        System.out.println("Task 2");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] secondArr = {1.57d, 7.654d, 9.986d};
        int[] random = {14, 75, 24, 8, 3, 0};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i]);
            if (i != secondArr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i]);
            if (i != random.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] secondArr = {1.57d, 7.654d, 9.986d};
        int[] random = {14, 75, 24, 8, 3, 0};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = secondArr.length - 1; i >= 0; i--) {
            System.out.print(secondArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
            System.out.println();
            for (int i = random.length - 1; i >= 0; i--) {
                System.out.print(random[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
        System.out.println();
        }
    public static void task4() {
        System.out.println("Task 4");
        int[] arr = {1,2,4};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] % 2 !=0) {
                arr [i] += 1;
            }
            System.out.println(arr [i]);
        }
    }
    }