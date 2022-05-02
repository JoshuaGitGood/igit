import java.util.Scanner;

public class C8E7 {
    public static void main(String[] args) {
        Play ball = new Play();
        int numberOfPlayer;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter # of player/s : ");
        numberOfPlayer = sc.nextInt();
        ball.gameInit(numberOfPlayer);
        sc.close();

    }

}
