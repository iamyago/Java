package academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.classex;

public class aluno {
    private String nome;
    private int idade;
    private seminario seminario;

    public aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
