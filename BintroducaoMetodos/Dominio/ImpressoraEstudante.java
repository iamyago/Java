package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

import academy.devjojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante){

        System.out.println("----------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
