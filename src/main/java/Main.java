import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println("Welcome to the calculator\n");
        System.out.println("Enter a command:\n");
        Scanner reader = new Scanner(System.in);

        while(reader.hasNext()) {
            String z = reader.next();
            if ((z.equals("fibonacci")) || (z.equals("binary"))) {
                int t = reader.nextInt();

                if (z.equals("fibonacci")) {
                    int f = calc.fibonacciNumberFinder(t);
                    System.out.println(f);
                } else if (z.equals("binary")) {
                    String i = calc.intToBinaryNumber(t);
                    System.out.println(i);
                }
            }
            else {
                int x = reader.nextInt();
                int y = reader.nextInt();


                if (z.equals("add")) {
                    int a = calc.add(x, y);
                    System.out.println(a);
                } else if (z.equals("subtract")) {
                    int s = calc.subtract(x, y);
                    System.out.println(s);
                } else if (z.equals("divide")) {
                    int d = calc.divide(x, y);
                    System.out.println(d);
                } else if (z.equals("multiply")) {
                    int m = calc.multiply(x, y);
                    System.out.println(m);
                }
            }
        }

    }

}
