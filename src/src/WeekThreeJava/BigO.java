package WeekThreeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BigO {

    // Entrego um O(1) = Tempo de execução sempre igual.
    // Esse é meu objetivo com motor adaptativo, entregar um código 0(1).
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Entrego um O(log de N), conhecido com dividir pra conquistar.
    // Eu divido para não percorrer toda uma lista;
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length -1;

        // Enquanto a lista não for toda percorrida, porque eu vou "fole-ar";
        // Na esquerda tenho livro fechado, a direita representa a última folha.
        while (left <= right) {
            // O meio do livro é representado por a página atual (left) + (a ultima folha menos oque já leu) e ai divide por 2;
            // Seria algo como : 10 + (50 - 10 = 40) = 50 / 2;
            int mid = left + (right - left ) / 2;

            // Encontrei o target
            if (array[mid] == target) {
                return mid;
            }

            // Procure no conjunto a direita
            if (array[mid] < target) {
                left = mid +1;
            }

            // Procure no conjunto a esquerda.
            else right = mid - 1;

        }
        return  -1;
    }

    // O que eu utilizava muito, e aprendi que não é uma boa prática.
    // O(n) que varre tudo para encontrar um.
    public static String findAll(String[] array, String target) {
        for (String name : array) {
            if (name.equals(target)) {
                return "Encontrei";
            }
        }
        return "Não encontrado";
    }

    // O que eu utilizava muito, e aprendi que não é uma boa prática.
    // O(n) que varre tudo para encontrar um.
    public static String findWithMemory(String[] array, String target) {
        String memo = "";
        if (memo.equals(target)) {
            return "Encontrei";
        } else for (String name : array) {
            if (name.equals(target)) {
                memo = target;
                return "Encontrei";
            }
        }
        return "Não encontrado";
    }

    //Um helper para sair de O(2^n) para O(n)
    private static final HashMap<String, String> memory = new HashMap<>();
    public static String process (String input) {
        if (input.length() <= 1) return input;
        if (memory.containsKey(input)) return memory.get(input);
        String result = process(input.substring(1) + input.charAt(0));
        memory.put(input,result);
        return result;
    }

}


