package Chapter3;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.sql.SQLOutput;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'T';

        do{
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");

            //Получить символ с клавиатуры
            ch = (char) System.in.read();
            //отбросить все остальные символы во входном буфере
            do{
                ignore = (char) System.in.read();
            }while (ignore != '\n');
            if(ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...Извините, нужная буква находится ");
                if(ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.print("ближе к началу алфавита");
                System.out.println("Повторите попытку! \n");
            }
        }while (answer != ch);
    }
}
