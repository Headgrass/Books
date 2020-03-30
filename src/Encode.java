public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        //зашифровать сообщение
        for(int i=0; i<msg.length(); i++)
            //построение зашифрованной строки
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        //дешифровать сообщение
        for(int i=0; i<msg.length(); i++)
            //построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
