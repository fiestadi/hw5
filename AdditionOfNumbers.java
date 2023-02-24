package summaNumbers;

public class AdditionOfNumbers {

     public static void main(String[] args) {
         String q = "Введите любое трехзначное число";
         System.out.println(q);
      int y = 156;
      int a1 = y%10;
      int a2 = y/10 %10;
      int a3 = y/100;
      int result = a2 + a1 + a3;
      System.out.println("Сумма всех цифр равна");
System.out.println(result);
    }
}

