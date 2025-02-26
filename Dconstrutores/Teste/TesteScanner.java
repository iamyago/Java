package academy.devjojo.maratonajava.javacore.Dconstrutores.Teste;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira algo");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("é par");
        }else {
            System.out.println("È impar");
        }

    }
}
