import java.util.*;

public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int n = nc.nextInt();
        List<Integer> res = n_prime(n);
        System.out.println(res);
        nc.close();
    }

    public static List<Integer> n_prime(int n){
        boolean check[] = new boolean[n+1];
        check[0] = true;
        check[1] = true;

        for (int i = 2; i*i < n+1; i++) {
            for(int j=i*i; j<check.length; j += i){
                check[j] = true;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i=0; i<check.length; i++){
            if(!check[i]){
                res.add(i);
            }
        }
        return res;
    }
}
