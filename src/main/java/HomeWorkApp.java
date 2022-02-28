import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        System.out.println(Arrays.toString(taskFive(3, 4)));
        taskSix();
        taskSeven(new int[] {2, 2, 2, 1, 2, 2, 10, 1});
        taskEight(new int[] {1,2,3},1);

    }

    public static void taskOne() {
        int[] arr = {1, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }
        }
    }
    public static void taskTwo() {
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

    }
    public static void taskThree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
    public static void taskFour() {
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
            }
        }
    }
    public static int[] taskFive(int len, int initialValue) {
        int arr[] = new int[len];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void taskSix() {
        int[] arr = {2,1,3,4};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }else if(arr[i] > max) {
                max = arr[i];
            }
        }
    }
    public static boolean taskSeven(int[] arr) {

        int max = arr[0];
        int leftNumber = 0;
        int rightNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = i;
            }
        }
        System.out.println("индекс максимального числа " + max);

        for(int i = 0; i < max; i++) {
            leftNumber += arr[i];
        }
        System.out.println("Сумма левой части " + leftNumber);

        for(int i = max; i < arr.length; i++) {
            rightNumber += arr[i];
        }
        System.out.println("Сумма правой части " + rightNumber);

        if(leftNumber == rightNumber) {
            return true;
        }else{
            return false;
        }

    }
    public static void taskEight(int[] arr, int n) {
        //не дошло :)
    }

}
