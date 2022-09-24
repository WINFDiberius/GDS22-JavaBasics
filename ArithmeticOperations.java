public class ArithmeticOperations {
    //erzeugen mit /** ... */
    /**
     * Auführung aller arithmetischen Operationen und Ausgabe
     * @param args
     */
    public static void main(String[] args) {

        int a = 4;
        int b = 9;

        int sum = a + b;

        System.out.println("Zahl1 " + a + " + Zahl2 " + b + " = Ergebnis " + sum);

        sum = a - b;

        System.out.println("Zahl1 " + a + " - Zahl2 " + b + " = Ergebnis " + sum);

        sum = a * b;



        System.out.println("Zahl1 " + a + " * Zahl2 " + b + " = Ergebnis " + sum);


        //double sumDouble =  (double) a / (double) b;
        double sumDouble = a / (1.0 * b);

        System.out.println("Zahl1 " + a + " / Zahl2 " + b + " = Ergebnis " + sumDouble);

        sum = a % b;

        System.out.println("Zahl1 " + a + " % Zahl2 " + b + " = Ergebnis " + sum);


    }
}
