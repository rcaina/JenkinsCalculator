import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculator calc = new Calculator();
        int y = 0;

        System.out.println("Welcome to the calculator\n");
        System.out.println("Enter a command:\n");
        Scanner reader = new Scanner(System.in);

        while(reader.hasNext()) {
            String z = reader.next();
            int x = reader.nextInt();
            if (!(z.equals("fibonnaci")) || !(z.equals("binary"))) {
                y = reader.nextInt();
            }

            if (z.equals("add")) {
                int a = calc.add(x, y);
                System.out.println(a + "\n");
            } else if (z.equals("subtract")) {
                int s = calc.subtract(x, y);
                System.out.println(s + "\n");
            } else if (z.equals("divide")) {
                int d = calc.divide(x, y);
                System.out.println(d + "\n");
            } else if (z.equals("multiply")) {
                int m = calc.multiply(x, y);
                System.out.println(m + "\n");
            } else if (z.equals("fibonacci")) {
                int f = calc.fibonacciNumberFinder(x);
                System.out.println(f + "\n");
            } else if (z.equals("binary")) {
                String i = calc.intToBinaryNumber(y);
                System.out.println(i + "\n");
            }
        }

    }

}
