import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFive(3, 4);

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

    }
    public static int[] taskFive(int len, int initialValue) {
        int arr[] = new int[len];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void taskSix() {

    }
    public static void taskSeven() {

    }
    public static void taskEight() {

    }

}
