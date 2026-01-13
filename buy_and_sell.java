public class buy_and_sell {
    public static void main(String[] args) {
        int[] input = { 7,1,5,3,6,4 };
        System.out.println(max_profit(input));
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
