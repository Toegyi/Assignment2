package problem4;

public class Prog4 {
    public static void main(String[] args) {
        float num1 = 1.27f;
        float num2 = 3.881f;
        float num3 = 9.6f;

        int sumIntCast = (int) (num1 + num2 + num3);
        System.out.println("Sum of floats as integer (cast): " + sumIntCast);

        int sumIntRound = Math.round(num1 + num2 + num3);
        System.out.println("Sum of floats as integer (rounded): " + sumIntRound);
    }
}

