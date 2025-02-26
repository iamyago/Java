package academy.devjojo.maratonajava.javacore.Fmodificadorstatic.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;
    // modificador Static
    // propriedade q é independente do objeto
    // metodo static pertence a classe e nao mais ao objeto
    // o atributo pertence a classe e os objetos compartilham do mesmo valor.

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime() {
        System.out.println("------");
        System.out.println("Nome" + this.nome);
        System.out.println("Velo max" + this.velocidadeMaxima);
        System.out.println("Velo limite" + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
