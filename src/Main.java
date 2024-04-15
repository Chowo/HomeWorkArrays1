import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 01
        System.out.println("Task 01");
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        boolean[] array3 = new boolean[5];
        array3[3] = true;

        //Task 02
        System.out.println("Task 02");
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.println(array2[i]);
            } else {
                System.out.printf("%s, ", array2[i]);
            }
        }
        System.out.println(Arrays.toString(array3));

        //Task 03
        System.out.println("Task 03");
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array1[i]);
            } else {
                System.out.printf("%s, ", array1[i]);
            }
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
            } else {
                System.out.printf("%s, ", array2[i]);
            }
        }
        for (int i = array3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array3[i]);
            } else {
                System.out.printf("%s, ", array3[i]);
            }
        }

        //Task 04
        System.out.println("Task 04");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));

    }
}
