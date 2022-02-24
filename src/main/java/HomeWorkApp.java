public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println(rangeOfSum(10, 1));
        posOrNegNumb(10);
        System.out.println(posOrNegNumbBool(-1));
        printString("qkrq", 5);
        System.out.println(oddYear(2022));
    }

    public static boolean rangeOfSum(int firstNum, int secondNum) {
        if (firstNum + secondNum > 10 && firstNum + secondNum <=20) {
            return true;
        }else {
            return false;
        }
    }

    public static void  posOrNegNumb(int number) {
        if(number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean  posOrNegNumbBool(int number) {
        if(number >= 0) {
            return false;
        } else {
            return true;
        }
    }


    public static void printString(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    public static boolean oddYear (int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

}