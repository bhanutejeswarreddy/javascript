import java.util.*;

public class Main {
    public static boolean fun(String a) {
        char x, b;
        for (int i = 0; i < a.length(); i++) {
            x = a.charAt(i);
            for (int j = 0; j < a.length(); j++) {
                b = a.charAt(j);
                if (i == j)
                    continue;
                if (x == b)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        System.out.println(fun(s));
        System.out.println();
    }
}
