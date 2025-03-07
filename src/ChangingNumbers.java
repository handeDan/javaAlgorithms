package src;

public class ChangingNumbers {
    public static void main(String[] args) {
        changingNumbers();
    }
    public static void changingNumbers() {
        //problem: iki sayının yerini değiştirme.
        //alttaki inputlara göre num1 = 100 num2 = 50 olmalı.
        int num1 = 50;
        int num2 = 100;

        int num3 = num1; //50, temporary
        System.out.println("num3: " + num3 + " - " + "num1: " + num1);
        num1 = num2; //100
        System.out.println("num3: " + num3 + " - " + "num2: " + num2 + " - " + "num1: " + num1);
        num2 = num3;
        System.out.println("num3: " + num3 + " - " + "num2: " + num2 + " - " + "num1: " + num1);

        //ALTERNATİF_1: 3. bir değişken(num3) olmadan yukarıdaki methodu nasıl yaparız?
        int num_1 = 50;
        int num_2 = 100;
        num_1 = num_1 + num_2; //num_1 = 150
        num_2 = num_1 - num_2; //num_2 = 50
        num_1 = num_1 - num_2; //num_1 = 100

        System.out.println("num_2: " + num_2 + " - " + "num_1: " + num_1);
    }
}
