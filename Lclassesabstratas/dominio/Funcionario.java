package academy.devjojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double Salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        Salario = salario;
        calculaBonus();
    }
    public abstract void calculaBonus ();

    @Override
    public void imprime() {
        System.out.println("imprimindo");
    }
}
