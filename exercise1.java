import java.util.Scanner;
class exercise1 {
    public static void main(String[] args){
        double x;
        double y;
        double z;
       
        double answer = 0;
    
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        x= sc.nextDouble();
        y= sc.nextDouble();
        z= sc.nextDouble();
        
        answer= Math.cbrt(((Math.pow(x,2)+ Math.pow(y,2))-Math.abs(z)));




        // Calculate the value of an expression and store the final value in the answer
        
        /* You do not need to worry too much about the return statement for the 
        moment and just set the value of “answer” correctly*/
        System.out.println(""+answer);   
        sc.close();
    }
}
