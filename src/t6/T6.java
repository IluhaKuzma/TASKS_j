package t6;

import java.util.Scanner;

class T6 {

    static int w;
    static int k;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ ОБЪЕМ РЮКЗАКА: ");
        try {
            w = in.nextInt();
        } catch (Exception e) {
            System.out.println("ОШИБКА ВВОДА");
        }
        System.out.print("ВВЕДИТЕ КОЛИЧЕСТВО ПРЕДМЕТОВ: ");
        try {
            k = in.nextInt();
        } catch (Exception e) {
            System.out.println("ОШИБКА ВВОДА");
        }
        int[] weight = new int[k];
        int[] cost = new int[k];
        for(int i = 0;i<k;i++){
            System.out.print("ВВЕДИТЕ ВЕС ПРЕДМЕТА " + Integer.toString(i+1) + ": ");
            try {
                weight[i] = in.nextInt();
            } catch (Exception e) {
                System.out.println("ОШИБКА ВВОДА");
            }
            System.out.print("ВВЕДИТЕ ЦЕНУ ПРЕДМЕТА " + Integer.toString(i+1) + ":");
            try {
                cost[i] = in.nextInt();
            } catch (Exception e) {
                System.out.println("ОШИБКА ВВОДА");
            }
        }

        packBackpack(weight,cost,w);

        in.close();
    }
    static void packBackpack(int weight[], int costs[], int maxWeight) {
        int n = weight.length;
        int maxCost[][] = new int[maxWeight + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= maxWeight; w++) {
                if (weight[j-1] <= w) {

                    maxCost[w][j] = Math.max(maxCost[w][j - 1], maxCost[w - weight[j-1]][j - 1] + costs[j-1]);

                } else {

                    maxCost[w][j] = maxCost[w][j - 1];
                }
            }
        }
        System.out.print("НУЖНО ПОЛОЖИТЬ ПРЕДМЕТЫ: ");
        int k = maxWeight;
        for(int i=n;i>=1;i--){
            if (maxCost[k][i] != maxCost[k][i-1]){

                k = k - weight[i-1];
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.print("ЦЕННОСТЬ ГРУЗА: ");
        System.out.print(maxCost[maxWeight][n]);
    }
}