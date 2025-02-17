package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    // PRECISA DE UM ARGUMENTO QUANDO FOR SETAR
    public void setIdade(int idade){
        if (idade < 0 ){
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    // variaveis de referencias so acessam valores de atributos publico.
}
