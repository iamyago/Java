package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.test;


import academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
    }
}
