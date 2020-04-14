package t5;


import java.util.Scanner;
class T5 {

    static int n;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ ЧИСЛО: ");
        try {
            n = scanner.nextInt();
            scanner.close();
        }
        catch (Exception e) {
            System.out.println("ОШИБКА ВВОДА");
        }
        for(int i = 0; i <= n; i++) {
            String iS = new StringBuffer(Integer.toString(i)).reverse().toString();
            if (i == Integer.parseInt(iS)){
                System.out.println(i);
            }
        }
    }
}