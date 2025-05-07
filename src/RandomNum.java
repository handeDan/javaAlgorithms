package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100;
        int[] rakamArr = new int[n]; //array size = n

        for (int i = 0; i < n; i++) {
            rakamArr[i] = rand.nextInt(100);
            //System.out.println(random);
        }

        // 1-100 n uzunluğunda bir int array oluşturalım.
        // bu array'in her elemanı int sayı olacak.[23,55,63,63,...]
        // unique rakamları ekrana yazalım
        // 1 kez tekrar eden

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int rakam : frequencyMap.keySet()) {
            if (frequencyMap.get(rakam) == 1) {
                System.out.println(rakam);
            }
        }

    }
}
