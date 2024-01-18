import java.util.*;
 
public class long_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] narr = new String[n];
 
        for (int i = 0; i < n; i++) {
            narr[i] = sc.nextLine();
 
            char[] arr = new char[narr[i].length()];
 
            for (int j = 0; j < narr[i].length(); j++) {
                arr[j] = narr[i].charAt(j);
            }
 
            if (narr[i].length() > 10) {
                int tmp = narr[i].length() - 2;
                System.out.print(arr[0]);
                System.out.print(tmp);
                System.out.print(arr[narr[i].length() - 1]);
                System.out.println("");
            } else {
                System.out.println(narr[i]);
            }
        }
    }
}