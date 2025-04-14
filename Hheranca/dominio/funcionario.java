package academy.devjojo.maratonajava.javacore.Hheranca.dominio;

public class funcionario extends Pessoa {
    // herenca serve pra extender a funcionalidade de uma classe e manter o relacionamento entre elas
    // ou quando quer utilizar polimorfismo
    private double salario;

    // tag super esta se referindo ao objeto mais generico (super classe)
    // no caso atributos que esta sendo importado Pessoa.

    public void relatoriopagamento(){
        System.out.println("Eu " + this.nome);
    }

    // protected se for uma subclasse, consegue acessar qualquer atributo que esteja dentro do msm pacote
    // fora somente com uma subclasse.

    public void imprime(){
        System.out.println(this.salario);
        super.imprime();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
