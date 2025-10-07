package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public String idade;
    public double[] salarios;


    public void imprime() {
        if (salarios == null){
            return;
        }
        System.out.println(nome);
        System.out.println(idade);
        for (double salario : salarios) {
            System.out.println(salario + "");
        }
        ImprimirSalarios();
    }

    public void ImprimirSalarios() {
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial " + media);
    }
}
