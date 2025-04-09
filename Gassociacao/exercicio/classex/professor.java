package academy.devjojo.maratonajava.javacore.Gassociacao.exercicio.classex;

public class professor {
    private String nome;
    private String especialidade;
    private seminario[] seminario;

    public professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public seminario[] getSeminario() {
        return seminario;
    }

    public professor(String nome, String especialidade, seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("---------");
        System.out.println("professor" + this.nome);
        if (this.seminario == null) return;
        System.out.println("Seminarios cadastrados ");
        for (seminario seminario1 : this.seminario) {
            System.out.println(seminario1.getTitulo());
            System.out.println(seminario1.getLocal().getEndereco());
            System.out.println("-- Alunos --");
            for (aluno aluno : seminario1.getAlunos()) {
                System.out.println("aluno : " + aluno.getNome() + " idade : " + aluno.getIdade());

            }

        }

    }

    public void setSeminario(seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
