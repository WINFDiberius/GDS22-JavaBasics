public class Calculator {

    public static void main(String[] args) {

        System.out.println("Dies ist mein Taschenrechner");

        String Calculator = "Calcyplus";

        int number1 = 9;
        int number2 = 4;
        int zero = 0;

        int solution;

        solution = number1 + number2;

        System.out.println("Mein Name ist: " + Calculator + " Ergebnis: " + solution);

        System.out.println("Mein Name ist: " + Calculator + " Ergebnis der Addition: " + addition(number1,number2));
        System.out.println("Mein Name ist: " + Calculator + " Ergebnis der Subtraktion: " + subtraktion(number1,number2));
        System.out.println("Mein Name ist: " + Calculator + " Ergebnis der Multiplikation: " + multiplikation(number1,number2));
        System.out.println("Mein Name ist: " + Calculator + " Ergebnis der Division: " + division(number1,number2));
        System.out.println("Mein Name ist: " + Calculator + " Ergebnis des Modulo: " + modulo(number1,number2));

        System.out.println("Mein Name ist: " + Calculator + " Ergebnis der Quadrierung: " + power(number1));
    }

    public static int addition(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    public static int subtraktion(int number1, int number2){
        int result = number1 - number2;
        return result;
    }

    public static int multiplikation(int number1, int number2){
        int result = number1 * number2;
        return result;
    }

    public static double division(int number1, double number2){
        if(number2 != 0) {
            double result = number1 / number2;
            return result;
        }
        else{
            System.out.println("Durch 0 kann nicht dividiert werden");
            return 0;
        }

    }

    public static int modulo(int number1, int number2){
        int result = number1 % number2;
        return result;
    }

    public static int power(int number1){
        int result = number1 * number1;
        return result;
    }
}
