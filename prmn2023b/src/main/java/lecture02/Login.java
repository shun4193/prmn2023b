package lecture02;

import java.util.Scanner;

public class Login {

    private String[][] studentNumberAnsPasswords;

    private Scanner scan;

    Login() {
        studentNumberAnsPasswords = new String[][]{
                {"B2221950", "aiueo"},
                {"B2225043", "kakikukeko"},
                {"B2221435", "sasisuseso"},
                {"B2225341", "tatituteto"},
                {"B2226435", "naninuneno"},
        };

        scan = new Scanner(System.in);
    }

    int exisistNumber() {
        System.out.print("学籍番号を入力してください : ");
        String number = scan.next();

        int matchIndex = -1;
        for(int i = 0; i < studentNumberAnsPasswords.length; i++) {
            if(number.equals(studentNumberAnsPasswords[i][0])) {
                matchIndex = i;
                break;
            }
        }
        return matchIndex;
    }

    boolean exisistPassword(int index) {
        System.out.print("パスワードを入力してください : ");
        String password = scan.next();
        return studentNumberAnsPasswords[index][1].equals(password);
    }
}
