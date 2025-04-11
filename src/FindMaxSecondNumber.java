package src;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class FindMaxSecondNumber {
    public static void main(String[] args) {
        //problem: bir dizideki en büyük 2. sayıyı bulma.

        int[] numbers = {20, 200, 150, 100, 50, 25, 47, 49, 250, 225};

        //1. yöntem: treemap'in sorting işleminden yararlanıyoruz:
        TreeMap<Integer, Integer> numberMap = new TreeMap<>(Collections.reverseOrder()); //tersten sıralama

        for (int num : numbers) {
            numberMap.put(num, num);
        }

        //listeye çeviriyoruz, çünkü indexleri var:
        List<Integer> sortedNumbers = numberMap.keySet().stream().toList();
        int secondMaxNum = sortedNumbers.size() > 1 ? sortedNumbers.get(1) : -1;
        System.out.println("en büyük 2. sayı : " + secondMaxNum);

        /*Iterator<Integer> iterator = numberMap.keySet().iterator();

        //ilk elemanı atlıyoruz (max elemanı):
        if(iterator.hasNext()) {
            iterator.next();
        }

        //2. max elemanı buluyoruz:
        if(iterator.hasNext()) {
            int secondMaxNum2 = iterator.next();
            System.out.println("en büyük 2. sayı : " + secondMaxNum2);
        }*/

        //2. yöntem:
        int enBuyukSayi = numbers[0];
        int enBuyukIkinciSayi = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > enBuyukSayi) {
                enBuyukSayi = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > enBuyukIkinciSayi && numbers[i] < enBuyukSayi) {
                enBuyukIkinciSayi = numbers[i];
            }
        }

        System.out.println("En büyük sayı : " + enBuyukSayi);
        System.out.println("En büyük ikinci sayı : " + enBuyukIkinciSayi);

        //3. yöntem: tek for döngüsüyle
    /*for(int i = 1; i<numbers.length; i++) {
        if(numbers[i] > enBuyukSayi) {
            enBuyukIkinciSayi = enBuyukSayi;
            enBuyukSayi = numbers[i];
        }
        if(numbers[i] < enBuyukSayi && numbers[i] > enBuyukIkinciSayi) {
            enBuyukIkinciSayi = numbers[i];
        }
    } */

    }
}
