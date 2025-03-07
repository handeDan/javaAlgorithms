package src;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 65465654;
        numbers[1] = 1000;
        numbers[2] = 589;
        numbers[3] = 234;
        numbers[4] = 567;
        numbers[5] = 97;
        numbers[6] = 8656;
        numbers[7] = 999;
        numbers[8] = 154498;
        numbers[9] = 2546;
        System.out.println(minNumber(numbers));
    }

    static int minNumber(int[] numbers) {
        //problem: bir dizideki en büyük sayıyı bulma.
        // int[] numbers = new int[10]; //random numbers array
        int minNum = numbers[0];
        //int minNum = Integer.MAX_VALUE; //böyle de yazabiliriz. bu sayıdan daha küçük bir integer yok.
        //Integer MIN_VALUE & MAX_VALUE değerlerine bakılabilir.
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        return minNum;
    }

}
