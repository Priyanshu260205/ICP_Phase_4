import java.util.*;

public class three_sum {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int n = nc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < input.length; i++) {
            input[i] = nc.nextInt();
        }
        List<List<Integer>> res = sumo(input);
        System.out.println(res);
        nc.close();

    }

    public static List<List<Integer>> sumo(int[] input){
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            int j = i+1;
            int k = input.length-1;
            while(j < k){
                int sum = input[i] + input[j] + input[k];
                List<Integer> ls = new ArrayList<>();
                if(sum == 0){
                    ls.add(input[i]);
                    ls.add(input[j]);
                    ls.add(input[k]);
                    res.add(ls);
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return new ArrayList<List<Integer>>(res);
    }
}
