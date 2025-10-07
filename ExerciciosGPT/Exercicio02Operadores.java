package ExerciciosGPT;

public class Exercicio02Operadores {
    public static void main(String[] args) {
        int numero1 = 8;
        int numero2 = 2;
        System.out.println(numero1+numero2);
        System.out.println(numero1-numero2);
        System.out.println(numero1*numero2);
        System.out.println(numero1/numero2);

        // resto
        int number1 = 10;
        int number2 = 3;
        System.out.println(number1%number2);

        // media aritimetica
        int media1 = 7;
        int media2 = 8;
        int media3 = 10;
        int i = (media1 + media2 + media3) / 3;
        System.out.println(i);

        // area de um retangulo
        int largura = 5;
        int altura = 3;
        System.out.println(largura*altura);

        // Peça ao usuário o salário atual e um percentual de aumento. Calcule e exiba o novo salário.
        // Digite o salário atual: 2000
        //Digite o percentual de aumento: 10
        double salario = 2000;
        double salario2 = 10;
        System.out.println(salario + (salario*salario2/100));

    }
}
