package t4;

import java.util.Scanner;
class T4 {
    public static void main(String[] args) {
        int counter = 0;
        String text;
        String word;
        String[] arrOfWords;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ТЕКСТ");
        text = scanner.nextLine();
        System.out.println("ВВЕДИТЕ СЛОВО");
        word = scanner.nextLine();
        scanner.close();
        arrOfWords = text.split(" ");
        for(int i = 0; i < arrOfWords.length; i++) {
            if (    (arrOfWords[i].equalsIgnoreCase(word)) ||
                    (arrOfWords[i].equalsIgnoreCase(word + ".")) ||
                    (arrOfWords[i].equalsIgnoreCase(word + ",")) ||
                    (arrOfWords[i].equalsIgnoreCase(word + "!")) ||
                    (arrOfWords[i].equalsIgnoreCase(word + "?")) ||
                    (arrOfWords[i].equalsIgnoreCase(word + ";")) ||
                    (arrOfWords[i].equalsIgnoreCase(word + "...")))
            {
                counter++;
            }
        }
        System.out.printf("КОЛИЧЕСТВО СЛОВ **%s** - %d", word, counter);
    }
}
