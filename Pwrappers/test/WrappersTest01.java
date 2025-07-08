package academy.devjojo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // ctrL + F
        //ctrl + R

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 10;  // autoboxing - Java faz a conversão automatica do tipo primitivo para wrapper
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing - wrapper para o tipo primitivo
        // parse é um metodo statico

    }
}
