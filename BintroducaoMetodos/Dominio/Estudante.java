package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

public class Estudante{
    public String nome;
    public double idade;
    public char sexo;

    public void imprime(){
        // SEMRPE BOM INDENTIFICAR COM A TAG THIS.
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }
    
}
