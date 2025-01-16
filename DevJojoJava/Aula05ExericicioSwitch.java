package academy.devjojo.maratonajava.introducao;

public class Aula05ExericicioSwitch {
    public static void main(String[] args) {
        // usando o switch dado os valores 1 a 7, imprima se é dia util ou final de semana
        // considerando 1 como domingo
        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("É domingo e FDS");
                break;
            case 2:
                System.out.println("É Segunda dia util");
                break;
            case 3:
                System.out.println("É Terça dia util");
                break;
            case 4:
                System.out.println("É Quarta e dia util");
                break;
            case 5:
                System.out.println("É Quinta e dia util");
                break;
            case 6:
                System.out.println("É Sexta e dia util");
                break;
            case 7:
                System.out.println("É Sabado e FDS");
                break;
        }
        byte mes = 1;
        switch (mes) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;

        }
    }
}
