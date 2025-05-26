package academy.devjojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double Salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        Salario = salario;
        calculaBonus();
    }
    public abstract void calculaBonus ();
}
