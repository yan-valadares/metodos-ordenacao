package model;

import java.util.Arrays;

public class RadixSort extends ModeloMetodo {

    private Integer[] numeros;

    public RadixSort(Integer[] elementos) {
        this.numeros = new Integer[elementos.length];
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }

    @Override
    public Integer realizarOperacao() {
        int[] intArray = Arrays.stream(numeros).mapToInt(Integer::intValue).toArray();
        return radixSort(intArray);
    }

    public Integer radixSort(int[] arr) {
        int trocasRealizadas = 0;

        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            trocasRealizadas += countingSort(arr, exp);
        }

        return trocasRealizadas;
    }

    private int countingSort(int[] arr, int exp) {
        int n = arr.length;
        int trocasRealizadas = 0;

        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
            trocasRealizadas++;
        }

        System.arraycopy(output, 0, arr, 0, n);

        return trocasRealizadas;
    }
}
