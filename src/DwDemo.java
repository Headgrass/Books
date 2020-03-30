import java.io.IOException;

public class DwDemo {
    public static void main(String args[]) throws IOException {
        char ch;

        do{
            System.out.println("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
            ch = (char) System.in.read(); // Получить символ с клавиатуры
        }while (ch != 'q');
    }
}
