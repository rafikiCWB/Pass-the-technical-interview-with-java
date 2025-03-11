package com.brisa.passthetechnicalinterviewwithjava.node.doubly;

import java.util.Arrays;

public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void maiorSequenciaConsecutiva() {
        int[] x = {9, 5, 10, 3, 7, 1};
        int aux;
        for (int i = 0; i < x.length; i++) {
           if (x[i] > x[i + 1]) {
               aux = x[i];
               x[i] = x[i + 1];
               x[i + 1] = aux;
           }
        System.out.println(Arrays.toString(x));
        }
    }

    public static void main(String[] args) {
        var fib = new Fibonacci();
        System.out.println(fib.fibonacci(3));
        System.out.println("---------");
        fib.maiorSequenciaConsecutiva();

    }
}
