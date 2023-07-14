import java.util.*;
public class Patterns{
    public static void hollow_rectangle(int rows, int columns){

        for(int i = 1;i<=rows;i++){
            for (int j = 1;j<=columns;j++){
                if(i ==1 || i ==rows || j==1 || j==columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }   
    public static void inverted_rotated_halfpyramid(int rows){

        for(int i = 1;i<=rows;i++){
            for (int j = 1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_withnos(int rows){
        int n = rows;
        for(int i = 1;i<=rows;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(j);
            }
        System.out.println();
        n=n-1;
        }
        
    }
    public static void floyd_triangle(int n){
        int s = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(s);
                System.out.print(" ");
                s++;
            }
        System.out.println();
        }
        
    }
    public static void zero_one_triangle(int n){
        boolean s = true;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(s==true){
                    System.out.print(1);
                    System.out.print(" ");
                    s = false;
                }
                else{
                    System.out.print(0);
                    System.out.print(" ");
                    s=true;
                }
            }
        System.out.println();
        }
    }
    public static void butterfly(int n){
        for (int i = 1;i<=n;i++){
            for(int j = 1;j<=2*n;j++){
                
                if(j<=i||j>=2*n-i+1){
                    System.out.print("*");
                    System.out.print(" ");
                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        for (int i = n;i>=1;i--){
            for(int j = 2*n;j>=1;j--){
                
                if(j<=i||j>=2*n-i+1){
                    System.out.print("*");
                    System.out.print(" ");
                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

    }
    public static void solid_rhombus(int n){
        
        for (int i = 1;i<=n;i++){
            
            for (int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=5;k++){
                if(i==1||i==n||k==1||k==n)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i = 1;i<=n;i++){
            for (int j = n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i = n;i>=1;i--){
            for (int j = n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
        System.out.println();
        }

    }
    
// MAIN PROGRAM //
    public static void main(String args[]){
        

    } 
}

