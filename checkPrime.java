import java.util.Scanner;
public class checkPrime {
    checkPrime(int n){
        int flag =0;
        if(n ==0 || n== 1){
            System.out.println("Not prime no");
        }
        else{
            for(int i = 2; i <= n/2;i++){
                if(n % i ==0){
                    System.out.println("Not a prime no");
                    flag =1;
                    break;
                }
            }
            if(flag ==0){
                System.out.println("Is Prime");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        int n = sc.nextInt();
        new checkPrime(n);
        sc.close();
    }
}
