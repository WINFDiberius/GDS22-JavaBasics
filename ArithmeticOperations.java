public class ArithmeticOperations {
    //erzeugen mit /** ... */
    /**
     * Auführung aller arithmetischen Operationen und Ausgabe
     * @param args
     */
    public static void main(String[] args) {

        int a = 3;
        int b = 2;

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

        // a++
        System.out.println();
        System.out.println("a++"); // a = a + 1
        System.out.println(a++); // ich erwarte mir 3 weil es noch nicht inkrementiert wurde
        System.out.println("a = " + a); // Ich erwarte mir 4 weil es nach der Ausgabe inkrementiert wurde
        System.out.println();

        // b++
        System.out.println("++b"); // b = b + 1
        System.out.println(++b); // ich erwarte mir 3
        System.out.println("b = " + b); // ich bin immer noch bei 3 weil es vorher inkrementiert wurde
        System.out.println();

    }
}
