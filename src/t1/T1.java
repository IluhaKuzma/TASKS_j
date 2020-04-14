package t1;
import java.util.InputMismatchException;
import java.util.Scanner;

class T1 {
    static String s = "";
    static float f = 0;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int t = 1;
        while (t == 1){
            System.out.println("ВВЕДИТЕ ЧИСЛО: ");

            try {
                f = scanner.nextFloat();
            }
            catch (InputMismatchException e) {
                System.out.println("ВВЕДЕНО НЕВЕРНОЕ ЧИСЛО");
                break;
            }

            if (f == (int)f) {
                num = (int) f;
                parity(num);
                simplicity(num);
            }
        }
        scanner.close();

    }
    private static void parity(int n){
        s = (n%2 == 0) ? "ЧЕТНОЕ" : "НЕЧЕТНОЕ";
        System.out.print(s);
    }

    private static void simplicity(int n) {
        boolean prime = true;
        int temp;
        for (int i=2; i<=n/2; i++) {
            temp = n % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        s = prime==true ? " И ПРОСТОЕ ЧИСЛО" : " И СОСТАВНОЕ ЧИСЛО";
        System.out.println(s);

    }
}
