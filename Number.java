package randomNumber;

import java.util.Random;

public class Number {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt((100) + 999);


        System.out.println(number);
        System.out.println("Наибольшая цифра ");

    }

    }


