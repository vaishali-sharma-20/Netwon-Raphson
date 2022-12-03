import java.lang.*;
import java.util.Scanner;

public class Newton_code {

    public static float f(float x) {
        return (x * x - x - 1);
    }

    public static float df(float x) {
        return (2 * x - 1);
    }

    public static void main(String[] args) {
        float x0, x1=0, f0, f1 = 0, g0, e;
        int step = 1, N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b: ");
        x0 = sc.nextFloat();
        System.out.println("Enter e: ");
        e = sc.nextFloat();
        System.out.println("Enter N: ");
        N = sc.nextInt();
        do {
            g0 = df(x0);
            f0 = f(x0);
            if (g0 == 0.0) {
                System.out.println("Mathematical Error.");
                break;
            }


            x1 = x0 - f0 / g0;


            System.out.println("Step:\t" + step + "\nx0:\t\t" + x0 + "\nx1:\t\t" + x1 + "\nf0:\t\t" + f0 + "\nf1:\t\t" + f1 + "\n");

            x0 = x1;

            step = step + 1;

            if (step > N) {
                System.out.println("Not Convergent.");
                break;
            }

            f1 = f(x1);

        } while (Math.abs(f1) > e);

        System.out.println("\nRoot is: " + x1);
    }
}
