public class CalculadoraSGE {

    public static Integer suma(Integer num1, Integer num2) {
        Integer S = num1 + num2;
        return S;
    }

    public static Integer resta(Integer num1, Integer num2) {
        Integer R = num1 - num2;
        return R;
    }

    public static Integer multiplicacion(Integer num1, Integer num2) {
        Integer M = num1 * num2;
        return M;
    }

    public static double division(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir entre 0.");
        }
        return (double) num1 / num2;
    }

    public static Double CalcularRaizCuadrada(Integer num) {
        if (num < 0) {
            System.out.println("No se puede realizar entre un numero negativo.");
        }
        return Math.sqrt(num);
    }

}
