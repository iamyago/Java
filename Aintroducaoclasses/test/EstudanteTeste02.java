package academy.devjojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        // primeiro criação da classe depois objeto. 
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome =  "Sanji";
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println("--------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
    }
}
