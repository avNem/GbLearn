import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        taskOne();
        taskTwo();
        taskThree();
        taskFive(3, 4);
        taskFour();
        taskSix();



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
    public static void taskSeven() {

    }
    public static void taskEight() {

    }

}
