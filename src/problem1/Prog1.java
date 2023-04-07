package problem1;
public class Prog1 {
    public static void main(String[] args) {
        RandomNumbers rand = new RandomNumbers();

        int x = rand.getRandomInt(1,9); // random integer in the range 1..9
        double pi_x = Math.pow(Math.PI,x);
        System.out.println("The Value is :" + pi_x);

        int y = rand.getRandomInt(3,14); // random integer in the range 3..14
        double y_pi = Math.pow(y,Math.PI);
        System.out.println("The Value is :" + y_pi);
    }
}
