package lecture02;

import java.util.Scanner;

public class Login {

    private String[][] studentNumberAndPasswords;

    private Scanner scan;

    Login() {
        studentNumberAndPasswords = new String[][]{
                {"B2221950", "aiueo"},
                {"B2225043", "kakikukeko"},
                {"B2221435", "sasisuseso"},
                {"B2225341", "tatituteto"},
                {"B2226435", "naninuneno"},
        };

        scan = new Scanner(System.in);
    }

    int existNumber() {
        System.out.print("学籍番号を入力してください : ");
        String number = scan.next();

        int matchIndex = -1;
        for(int i = 0; i < studentNumberAndPasswords.length; i++) {
            if(number.equals(studentNumberAndPasswords[i][0])) {
                matchIndex = i;
                break;
            }
        }
        return matchIndex;
    }

    boolean matchPassword(int index) {
        System.out.print("パスワードを入力してください : ");
        String password = scan.next();
        return studentNumberAndPasswords[index][1].equals(password);
    }
}
