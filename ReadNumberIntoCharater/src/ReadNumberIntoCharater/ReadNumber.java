package ReadNumberIntoCharater;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        ReadNumber readNumber = new ReadNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number has three number:_");
        int number = sc.nextInt();

        int hundred = number / 100;
        int dezone = number % 100;


        if (dezone == 0) {
            System.out.println(readNumber.units(hundred) + " hundred");
        } else {
            System.out.print(readNumber.units(hundred) + " hundred and ");

        }

        if (1 <= dezone && dezone <= 9) {
            System.out.println(readNumber.units(dezone));
        }

        if (10 <= dezone && dezone <= 19) {
            System.out.println(readNumber.dozens(dezone) + "");
        }

        if (20 <= dezone && dezone <= 90) {
            int dezonex = dezone / 10;
            int dezonexx = dezonex*10;
            int unit = dezone % 10;
            if (unit == 0) {
                System.out.println(readNumber.dozens2(dezonexx) + "");
            } else {
                System.out.println(readNumber.dozens2(dezonexx) + " " + readNumber.units(unit));
            }
        }
    }

    public String units(int unit) {
        String mess = "";
        switch (unit) {

            case 1:
                mess = "one";
                break;
            case 2:
                mess = "two";
                break;
            case 3:
                mess = "three";
                break;
            case 4:
                mess = "four";
                break;
            case 5:
                mess = "five";
                break;
            case 6:
                mess = "six";
                break;
            case 7:
                mess = "seven";
                break;
            case 8:
                mess = "eight";
                break;
            case 9:
                mess = "nine";
                break;
        }
        return mess;
    }

    public String dozens(int dozens) {
        String mess = "";
        switch (dozens) {
            case 10:
                mess = "ten";
                break;
            case 11:
                mess = "eleven";
                break;
            case 12:
                mess = "twelve";
                break;
            case 13:
                mess = "thirteen";
                break;
            case 14:
                mess = "fourteen";
                break;
            case 15:
                mess = "fifteen";
                break;
            case 16:
                mess = "sixteen";
                break;
            case 17:
                mess = "seventeen";
                break;
            case 18:
                mess = "eighteen";
                break;
            case 19:
                mess = "nineteen";
                break;
        }
        return mess;
    }

    public String dozens2(int dozens2) {
        String mess = "";
        switch (dozens2) {
            case 20:
                mess = "twenty";
                break;
            case 30:
                mess = "thirty";
                break;
            case 40:
                mess = "forty";
                break;
            case 50:
                mess = "fifty";
                break;
            case 60:
                mess = "sixty";
                break;
            case 70:
                mess = "seventy";
                break;
            case 80:
                mess = "eighty";
                break;
            case 90:
                mess = "ninety";
                break;
        }
        return mess;
    }
}
