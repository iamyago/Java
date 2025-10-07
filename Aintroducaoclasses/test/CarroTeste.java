package academy.devjojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nomecarro = "Porshe";
        carro1.modelocarro = "carrera gt";
        carro1.ano = 2025;

        carro2.nomecarro = "Skyline GTR";
        carro2.modelocarro = "R34";
        carro2.ano = 2009;

        carro1 = carro2;

        // fazer referencia carro1 = carro2; ou seja, igualar as duas variaveis.
        // mudando a ordem da variavel da o mesmo resultado so que opostos.
        /* as referencias tem que ser feita logo após os objetos, se for por objeto1 + sout e depois objeto 2 + sout =
        NÃO FUNCIONA --- tem quer ser, objeto1 + objeto2 depois a referencia depois o sout.
        */
        System.out.println("Carro1");
        System.out.println(carro1.nomecarro + " " + carro1.modelocarro + " " + carro1.ano);

        System.out.println("----------------");

        System.out.println("Carro 2");

        System.out.println(carro2.nomecarro + " " + carro2.modelocarro + " " + carro2.ano);


    }
}
