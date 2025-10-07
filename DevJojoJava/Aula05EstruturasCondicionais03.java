package academy.devjojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salary = 6000;
        String mensagemDoar =  "Eu vou doar 500 pro DevDojo ";
        String mensagemNaoDoar =  "Ainda não tenho condiçoes, mas vou ter";
        // Operador ternario - (condicao) ? verdadeiro : falso
        String resultado = salary > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
