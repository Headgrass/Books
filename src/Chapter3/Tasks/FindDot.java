package Chapter3.Tasks;

import java.io.IOException;

public class FindDot {
    public static void main(String[] args) throws IOException {
        System.out.println("Вводите любой символ, а как наиграетесь, ставьте точку");
        char ch, ignore;
        int score = 0;

        do {
            ch = (char) System.in.read();
            System.out.println("Вы ввели символ " + ch);
            if (ch == '\n') score++;
        }while (ch == 'w');
        System.out.println("Вы закончили вводить" + score);
    }
}
