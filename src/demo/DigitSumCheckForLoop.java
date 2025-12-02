package demo;

public class DigitSumCheckForLoop {
    public static void main(String[] args) {
        int num = 75547;
        int last = num % 10;
        int first = 0;
        for (int i = num; i > 0; i /= 10) {
            first = i;
        }
        int middleSum = 0;
        for (int i = num / 10; i > 10; i /= 10) {
            middleSum += i % 10;
        }
        if (first + last == middleSum) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

