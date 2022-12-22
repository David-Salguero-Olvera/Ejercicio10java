package diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Diccionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        HashMap<String, String> traducir = new HashMap<String, String>();
        Random generator = new Random();

        traducir.put("manzana", "apple");
        traducir.put("ciruela", "plum");
        traducir.put("pera", "pear");
        traducir.put("arandano", "cranberry");
        traducir.put("uva", "grape");
        traducir.put("coco", "coconut");
        traducir.put("platano", "banana");
        traducir.put("naranja", "orange");
        traducir.put("blanco", "white");
        traducir.put("lima", "lime");
        traducir.put("durazno", "peach");
        traducir.put("limon", "lemon");
        traducir.put("sandia", "watermelon");
        traducir.put("mora", "blackberry");
        traducir.put("piña", "pinaapple");
        traducir.put("fresa", "strawberry");
        traducir.put("mora azul", "blueberry");
        traducir.put("cereza", "cherry");

        Set<String> keySet = traducir.keySet();
        List<String> keyList = new ArrayList<>(keySet);
        int correctAnswers = 0;
        for(int i =0;i<5;i++) {
            int randIdx = new Random().nextInt(keyList.size());
            String randomWordES = keyList.get(randIdx);
            String randomWordEN = traducir.get(randomWordES);
            System.out.println("Introduzca la traduccion para la palabra en inglés: " +randomWordES);
            String answer = sc.nextLine();
            if(answer.equals(randomWordEN)) correctAnswers++;
        }
        System.out.println("Correct answers: " +correctAnswers);
    }
}