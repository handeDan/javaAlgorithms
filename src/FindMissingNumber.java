package src;

public class FindMissingNumber {
    public static void main(String[] args) {
        int missingNumber = findMissingNumber(new int[]{1,2,3,5});
        System.out.println(missingNumber);
    }
    static int findMissingNumber(int[] numbers) {
        //problem: ardışık olan sayıda eksik olan sayıyı bulalım. artış miktarı bu soruda her zaman 1(ardışık sayı).
        //input: [1,2,3,5,6,7,...] n elemanlı bir input. output: 4
        int missingNumber = -1; //missingNumber yoksa -1 olsun diye verdik.

        for(int i = 0; i<numbers.length-1; i++) {
            if(!(numbers[i+1] == numbers[i] + 1)) {
                missingNumber = numbers[i] + 1;
                break;
            }
        }
        return missingNumber;
    }
    //ALTERNATIVE SOLVE-1: toplam üzerinden bir çözüm de olabilir.
    //ALTERNATIVE SOLVE-2: [1,2,3,5,6]  length=5
    //normalde length+1 kadar uzunlukta olmalıydı
    //bu ikisi kıyaslanabilir
}
