package academy.devjojo.maratonajava.introducao;

    /*
     Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

     Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
     */

public class Exercicio03TiposPrimitivos {
    public static void main(String[] args) {
        double salary = 3000;
        String date  = "13/1/25";
        String name = "Yago Erik";
        String address = "Rua paraná 2070";

        System.out.println("Eu " + name + ", morando no endereço "+ address +" , confirmo que recebi de salario " + salary + ", na data " + date);  

    }
}
