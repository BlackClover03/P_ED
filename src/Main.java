public class Main {
    public static void main(String[] args) {

        Integer num1 = 20;
        Integer num2 = 10;
        System.out.println("Suma: "+ num1 + " + " + num2 + " = " + CalculadoraSGE.suma(num1, num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + CalculadoraSGE.resta(num1, num2));
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + CalculadoraSGE.multiplicacion(num1, num2));
        System.out.println("División: " + num1 + " / " + num2 + " = " + CalculadoraSGE.division(num1, num2));
    }
}