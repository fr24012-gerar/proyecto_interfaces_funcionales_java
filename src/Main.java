import interfaces_funcionales.Sumar;
import interfaces_funcionales.Transformar_String;

public class Main {

    public static void main(String[] args) {

        Sumar sumar = (num1, num2) -> num1 + num2;
        Sumar sumar_incrementar = (num1, num2) -> num1 + num2 + 1;

        //Interface Transformar_String
        Transformar_String aMayuscula = texto -> texto.toUpperCase();
        Transformar_String aMinuscula = texto -> texto.toLowerCase();

        System.out.println("usando sumar = " + sumar.aplicar(2, 2));
        System.out.println("usando sumar_incrementar = " + sumar_incrementar.aplicar(2, 2));

        System.out.println("usando aMayuscula: " + aMayuscula.transformar("juan"));
        System.out.println("usando aMinuscula: " + aMinuscula.transformar("STANLEEE"));
    }
}
