import java.util.Scanner;

public class C10E2 {
    public static void main(String[] args) throws Exception {
        String[] forward;
        System.out.print("STRING : ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.toLowerCase().replace(" ", "");
        int lengthFinal = text.length();
        boolean ispalindrome = true;
        forward = new String[lengthFinal];

        for (int i = 0; i < lengthFinal; i++) {
            forward[i] = String.valueOf(text.charAt(i));
        }

        for (int k = 0; k < lengthFinal; k++) {
            if (!forward[k].equals(forward[(lengthFinal - 1) - k])) {
                ispalindrome = false;
            }
        }
        if (ispalindrome) {
            System.out.println("TEXT/PHARASE IS PALINDROME");
        }
        if (!ispalindrome) {
            System.out.println("TEXT/PHARASE IS NOT PALINDROME");
        }

        sc.close();

    }
}
