package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Java.BintroducaoMetodos.test;

import academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Java.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        calculadora.somaArray(numeros);
        calculadora.somaVararags(numeros);
    }
}
