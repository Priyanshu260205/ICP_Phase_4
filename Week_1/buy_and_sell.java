import java.util.Scanner;

public class buy_and_sell {
    public static void main(String[] args) {
        // int[] input = { 7,1,5,3,6,4 };
        Scanner nc = new Scanner(System.in);
        int n = nc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < input.length; i++) {
            input[i] = nc.nextInt();
        }
        System.out.println(max_profit(input));
        nc.close();
    }

    public static int max_profit(int[] input){
        int maxp = 0;
        int mip = Integer.MAX_VALUE;

        for (int i : input) { 
            mip = Math.min(i, mip);
            maxp = Math.max(maxp, i-mip);
        }

        return maxp;
    }
}
