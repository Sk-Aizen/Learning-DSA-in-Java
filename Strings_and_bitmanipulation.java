import java.util.*;

public class Strings_and_bitmanipulation {

//program to check whether given string is palindrome or not
    public static void palindrome(String st){
        int c =0;
        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i)==st.charAt(st.length()-1-i)){
                c++;
            }
        }
        if (c==st.length()/2){
            System.out.println("palindrom");
        }
    }


//program to find shortest path(distance) in N,E,W,S
    public static void shortest_path(String st){
        int y = 0;
        int x = 0;
        for(int i = 0;i<st.length();i++){
            if(st.charAt(i)=='N'){
                y++;
            }
            else if(st.charAt(i)=='W'){
                x--;
            }
            else if(st.charAt(i)=='S'){
                y--;
            }
            else if(st.charAt(i)=='E'){
                x++;
            }
        }
        double distance = Math.pow(((x*x) + (y*y)),0.5);
        System.out.print(distance);
    }

//Program to find largest string
    public static void max_string(String[] arr){
        String max = "";
        for(int i =0;i<arr.length;i++){
            if(max.compareTo(arr[i])<0){
                max=arr[i];
            }
        }
        System.out.print(max);   
    }

//Program to convert first letter of words to Uppercase
    public static void uppercase(StringBuilder st){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(st.charAt(0)));
        for(int i = 1;i<st.length();i++){
            if(st.charAt(i)==' ' && i<st.length()-1){
                sb.append(' ');
                sb.append(Character.toUpperCase(st.charAt(i+1)));
                i++;
            }
            else{
                sb.append(st.charAt(i));
            }
        }
        System.out.print(sb);
    }

//Program to compress letters of a string
    public static void compress(String sb){
        StringBuilder st = new StringBuilder("");
        for(int i =0;i<sb.length();i++){
            Integer c=1;
            while(i<(sb.length()-1) && sb.charAt(i)==sb.charAt(i+1)){
                c++;
                i++;
            }
            st.append(sb.charAt(i));
            if(c>1){
                st.append(Integer.toString(c));
            }
        }
        System.out.print(st);
    }

    //program to check if given string is an anagram or not
    public static void anagrams(String st, String sb){
        st=st.toLowerCase();
        sb=sb.toLowerCase();
        if(st.length()!=sb.length()){
            System.out.print("Not anagrams");
        }
        else{
            for(int i = 0;i<st.length();i++){
            
            }
        }
    }
    
    //Program to get ith bit of a number
    public static void get_ith_bit(int n, int i){
        int bitmask = 1<<i;
        if((bitmask & n) == 0 ){
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
    }

    // Program to set or clear ith bit of a number
    public static void set_or_clear_ith_bit(int n, int i){
        System.out.print("clear/set?");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int bitmask=1<<i;
        if (a=="set"){
            n=(n|bitmask);
        }
        else{
            bitmask=~bitmask;
            n=(n&bitmask);
        }
        System.out.print(n);
        sc.close();
    }

    //Program to clear range of bits
    public static void clear_bits_in_range(int n,int s,int e){
        int a=(~0)<<(e+1);
        int b=(1<<s)-1;
        int bitmask = (a|b);
        System.out.print(n&bitmask); 
    }

    //Program to cheack if a number is a Power of 2 or not
    public static void power_of_2(int n){
        if((n & (n-1))==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    
    //Program to count Set bits in a number
    public static void count_set_bits(int n){
        int c=0;
        while(n>0){
            if((n&1)!=0){
                c+=1;
            }
            n=n>>1;
        }
        System.out.print(c);
    }
    //Program for fast exponentiation
    public static void fast_exponentiation(int n, int p){
        int ans=1;
        while(p>0){
            if((1&p)==1){
                ans*=n;
            }
            n*=n;
            p=p>>1;
        }
        System.out.print(ans);
    }
    // Program to swap two variables without using a third one
    public static void swap_2(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.print(a+" "+b);
    }
    

    public static void main(String args[]){
        swap_2(3, 5);
    }
}
