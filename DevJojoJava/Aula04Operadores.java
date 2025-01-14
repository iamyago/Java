package academy.devjojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Artimiteticos-  + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 + number02;
        System.out.println(result);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Comparação - < > boolean <= >= == !=
        // maoior que menor que, menor ou igual, maior ou igual, metodo de comparação, sinal de diferente, retorna true ou false
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        // operadores logicos - && (AND) || (or) !
        int idade = 35;
        float salary = 3500F;
        boolean isDentroDaLei = idade >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salary >= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLei " + isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 300;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente < valorPlayStation || valorTotalContaCorrente > valorPlayStation;
        System.out.println(isPlayStationCincoCompravel);

        // operadores de atribuição - += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador ++;
        contador ++;
        contador --;
        System.out.println(contador);




    }
}
