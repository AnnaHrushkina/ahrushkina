/* Demonstration of the difference between types int and double
Give the source file a name Example3
 */
public class Example3 {
    public static void main(String args[]){
        int var; // declare the whole variable
        double x; // declare a floating point variable
        var = 10;
        x = 10.0;
        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println(); // Print an empty line
        // Divide the value of both variables by 4
        var = var / 4;
        x = x / 4;
        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);
        }
    }

