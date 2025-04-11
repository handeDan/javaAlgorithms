package src;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindHowManyCount {

    //verilen array'deki her bir elemanın kaç kez geçtiğini bulma.
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 40, 50, 10, 30, 20, 10, 20, 30, 40, 50};

        //1. yöntem:
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        //Dizideki her elemanı key olarak saklarız.
        //o elemanın kaç kez geçtiğini value olarak tutarız.

        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println(frequencyMap);

        //2.yöntem:
        Map<Integer, Integer> frequencyMap1 = new TreeMap<>(); //treemap küçükten büyüğe sıralamış olur
        for (int num : arr) {
            frequencyMap1.put(num, frequencyMap1.getOrDefault(num, 0) + 1);
            //getOrDefault: bu key map'te yoksa 0 değerini verir, +1 ekleriz.
        }
        System.out.println(frequencyMap1);
    }
}
