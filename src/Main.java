import interfaces_funcionales.Sumar;

public class Main {

    public static void main(String[] args) {

        Sumar sumar = (num1, num2) -> num1 + num2;
        Sumar sumar_incrementar = (num1, num2) -> num1 + num2 + 1;

        System.out.println("usando sumar = " + sumar.aplicar(2, 2));
        System.out.println("usando sumar_incrementar = " + sumar_incrementar.aplicar(2, 2));
    }
}
