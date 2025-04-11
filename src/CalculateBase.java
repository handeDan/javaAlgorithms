package src;

public class CalculateBase {
    public static void main(String[] args) {
        //Girilen sayının basamaklarını toplayan algoritma
        int number = 134;

        int total = 0;

        while (number > 0) {
            total += number % 10; //son basamağı alırız
            number /= 10; //sonraki basamağa geçeriz: 13,4 int olduğu için 13'ü alır
        }

        System.out.println("Sayının basamakları toplamı : " + total);
    }
}
