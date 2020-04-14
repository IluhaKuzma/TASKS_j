package t3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class T3 {

    static int counter = 0;

    public static void main(String[] args) {
        print (toArrayOfStrings(readClause()));
    }

    public static String readClause() {

        System.out.println("ВВЕДИТЕ ПРЕДЛОЖЕНИЕ:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String clause = null;

        try {
            clause = reader.readLine();
        } catch (Exception e) {
            System.err.println("ОШИБКА ВВОДА!!!");
        }
        return clause;
    }

    public static ArrayList<String> toArrayOfStrings(String s) {

        StringTokenizer st = new StringTokenizer(s, "\t\n\r ");

        ArrayList<String> listOfStrings = new ArrayList<String>();
        String token;
        char c;

        while (st.hasMoreTokens()) {
            token = st.nextToken();
            listOfStrings.add(token);
            counter++;
        }
        Collections.sort(listOfStrings);

        return listOfStrings;
    }

    public static void print(ArrayList<String> list) {

        String s1;
        System.out.println("КОЛИЧЕСТВО СЛОВ В ПРЕДЛОЖЕНИИ: " + counter);

        for (String s: list) {
            s1 = String.valueOf(s.charAt(0));
            s = s.replaceFirst(s1, s1.toUpperCase());
            System.out.println(s);
        }
    }
}
