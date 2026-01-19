package Week_2.Day_1;

import java.util.Scanner;

public class stack_imp_arr {
    static int[] arr;
    static int idx;
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int n = nc.nextInt();
        arr = new int[n];
        idx = 0;

        while(true){
            System.out.println("1 : for push 2 : for pop 3 : for peek");
            int choice = nc.nextInt();
            
            if(choice == 1){
                int v= nc.nextInt();
                push(v);
            }
            else if(choice == 2) pop();
            else if(choice == 3) peek();

            System.out.println("Do you want to continue: Y/N");
            char flag = nc.next().charAt(0);
            if(flag == 'N' || flag == 'n') break;

        }
        nc.close();
    }

    public static void push(int v){
        if(idx < arr.length){
            arr[idx++] = v;
        }
        else{
            System.out.println("Size limit exceeded...");
        }
    }

    public static void pop(){
        if(idx > 0){
            System.out.println(arr[idx-1]);
            idx--;
        }
        else{
            System.out.println("Underflow detected...");
        }
    }

    public static void peek(){
        if(idx >= 0){
            System.out.println(arr[idx-1]);
        }
    }
}
