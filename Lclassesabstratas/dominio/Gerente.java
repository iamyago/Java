package academy.devjojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", Salario=" + Salario +
                '}';
    }
    // classes podem ser abstratas
    // funcionalidade da classe abstrata pode ser extendida
    // não pode criar um objeto de um classe abstrata.
}
