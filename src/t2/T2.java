package t2;
import java.util.Scanner;

class T2 {

    static float in_1;
    static float in_2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gcd;
        int lcm;
        int a;
        int b;
        int t = 1;
        while (t==1){
            System.out.print("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО: ");
            try {
                in_1 = in.nextFloat();
            } catch (Exception e) {
                System.out.println("ОШИБКА ВВОДА");
                break;
            }
            if (in_1==(int)in_1){
                System.out.print("ВВЕДИТЕ ВТОРОЕ ЧИСЛО: ");
                try {
                    in_2 = in.nextFloat();
                } catch (Exception e) {
                    System.out.println("ОШИБКА ВВОДА");
                    break;
                }
                if (in_2==(int)in_2){
                    a = (int)in_1;
                    b = (int)in_2;
                    gcd = findGCD(a,b);
                    lcm = findLCM(a,b);
                    System.out.println("НОД - " + gcd + "; НОК - " + lcm);

                } else{
                    System.out.println("ВВЕДЕНО НЕВЕРНОЕ ЧИСЛО ");
                }
            }
            else{
                System.out.print("ВВЕДЕНО НЕВЕРНОЕ ЧИСЛО");
            }
        }
        in.close();
    }

    static int findGCD(int x,int y){
        return y == 0 ? x : findGCD(y,x % y);
    }
    static int findLCM(int x,int y){
        return (x*y) / findGCD(x,y);
    }
}
