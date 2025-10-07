package academy.devjojo.maratonajava.javacore.Jmoficadorfinal.test;

import academy.devjojo.maratonajava.javacore.Jmoficadorfinal.dominio.Carro;
import academy.devjojo.maratonajava.javacore.Jmoficadorfinal.dominio.Comprador;
import academy.devjojo.maratonajava.javacore.Jmoficadorfinal.dominio.Ferrari;

public class carroteste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Yago");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Yago");
        ferrari.imprime();
    }
}
