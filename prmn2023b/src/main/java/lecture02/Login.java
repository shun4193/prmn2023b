package lecture02;

import java.util.HashMap;
import java.util.Scanner;

public class Login {

    String number, password;
    private String[] studentNumbers, passwords;
    private HashMap<String, String> numberAndPasswords = new HashMap<String, String>();
    private Scanner scan = new Scanner(System.in);

    Login() {
        studentNumbers = new String[]{
                "B2221950",
                "B2225043",
                "B2221435",
                "B2225341",
                "B2226435",
        };

        passwords =  new String[]{
                "aiueo",
                "kakikukeko",
                "sasisuseso",
                "tatituteto",
                "naninuneno",
        };

        for (int i = 0; i < passwords.length; i++) numberAndPasswords.put(studentNumbers[i], passwords[i]);
    }


    boolean exisistNumber() {
        System.out.print("学籍番号を入力してください : ");
        number = scan.next();
        return numberAndPasswords.containsKey(number);
    }

    boolean exisistPassword() {
        System.out.print("パスワードを入力してください : ");
        password = scan.next();
        return numberAndPasswords.get(number).equals(password);
    }
}
