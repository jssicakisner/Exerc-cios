package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> grupos = numeros.stream()
                                                    .collect(Collectors.partitioningBy(numero -> numero % 2 == 0));

        List<Integer> numerosPares = grupos.get(true);
        List<Integer> numerosImpares = grupos.get(false);

        System.out.println("Numeros pares: " + numerosPares);
        System.out.println("Numeros Impares: " + numerosImpares);
    }
}
