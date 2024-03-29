package lecture02;

public class Keisan {
    public int sum(int[] array) {
        int sum = 0;
        for (int value : array) sum += value;
        return sum;
    }

    public void resultPrint(int sum) {
        System.out.println("合計値 : " + sum);

        if (sum >= 100) {
            System.out.println("great!");
        } else if (sum >= 50) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }
    }
}
