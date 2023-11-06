package lecture02;

public class prac3 {
    public static void main(String[] args) {
        Login login = new Login();

        int matchIndex = login.existNumber();
        if (matchIndex == -1) {
            System.out.println("error!!");
            System.exit(0);
        }

        if (!login.matchPassword(matchIndex)) {
            System.out.println("不正なアクセス");
            System.exit(0);
        }

        System.out.println("ログイン完了");
    }
}
