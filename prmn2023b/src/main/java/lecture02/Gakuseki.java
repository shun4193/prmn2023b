package lecture02;

public class Gakuseki {
    private String number = "B2221950";

    public void matchNumber(String gakuseki) {
        if(number.equals(gakuseki)) {
            System.out.println("complete!");
        } else {
            System.out.println("error!");
        }
    }
}
