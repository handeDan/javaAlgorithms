package src;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 1000;
        numbers[2] = 589;
        numbers[3] = 234;
        numbers[4] = 567;
        numbers[5] = 97;
        numbers[6] = 8656;
        numbers[7] = 999;
        numbers[8] = 154498;
        numbers[9] = 2546;
        System.out.println(maxNumber(numbers));
    }

    static int maxNumber(int[] numbers) {
        //problem: 3. bir dizideki en büyük sayıyı bulma.
        // int[] numbers = new int[10]; //random numbers array
        int maxNum = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

}
