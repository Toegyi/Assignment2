package problem6;

public class Prog6 {
    public static void main(String[] args) {
        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minValue = arr[0];
        for (int i= 0; i< arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Min Value is "+ minValue);
    }

}
