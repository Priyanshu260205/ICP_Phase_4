import java.util.Scanner;

public class first_occurance {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        String s = nc.nextLine();
        String check = nc.nextLine();

        System.out.println(index_check(s, check));
        nc.close();
    }

    public static int index_check(String s, String check){
        if(s.length() < check.length()){
            return -1;
        }
        int n = s.length();
        int m = check.length();
        for (int i = 0; i < n; i++) {
            String part = s.substring(i, i+m);
            if(part.equals(check)){
                return i;
            }
        }
        return -1;
    }
}
