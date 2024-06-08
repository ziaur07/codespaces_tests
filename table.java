import java.util.Scanner;




public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int result = 0 ;
        
        if (n>= 2 && n<= 20){
            for ( i = 1; i<=10; i ++){
            System.out.println(n + " * " + i + " = "+ n * i);
            }
            
        }
        
        
        

       
    }
}