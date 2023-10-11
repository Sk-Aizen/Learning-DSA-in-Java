public class Recursion {
    // Programs to print numbers in increasing and decreasing order
    public static void printinc(int n){
        if(n>0){
            printdec(n-1);
            System.out.print(n + " ");
        }
    }
    public static void printdec(int n){
        if(n>0){
            System.out.print(n + " ");
            printdec(n-1);
        }
    }
    // Program to print factorial of a number
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        n*=(factorial(n-1));
        return n;
    }
    // Program to print nth number from the fibonacci series
    public static int nth_fibonacci(int n){
        if(n==0 || n==1){
            return n ;
        }
        int n1=nth_fibonacci(n-1);
        int n2=nth_fibonacci(n-2);
        n=n1+n2;
        return n;
    }
    // Program to check if given array is sorted or not
    public static void is_sorted(int[] arr,int i){
        if(arr[arr.length-2]<arr[arr.length-1]){
            System.out.print("Yes");
        }
        else if(arr[i]<arr[i+1]){
            is_sorted(arr, i+1);
        }
        else{
            System.out.print("No");
        }
    }
    //Program to find and return the first occurance of given element
    public static void first_occurance(int[] arr,int i, int key){
        if(arr[i]==key){
            System.out.print("Found at index:"+i);
        }
        else if(i<arr.length-1){
            first_occurance(arr, i+1, key);
        }
        else{
            System.out.print("Item not found");
        }
            
    }
    //Program to find the and return the last occurance of given element
    //here we are going to the last element first and then move backwards
    public static int last_occurance(int arr[],int i, int key){
        if(i==arr.length){
            return -1;
        }
        int s = last_occurance(arr, i+1, key);
        if(s==-1 && arr[i]==key){
            return i;
        }       
        return s; 
    }
    // x to the power n
    public static int x_power_n(int x, int n){
        if(n==1){
            return x;
        }
        return x * x_power_n(x, n-1);
    }
    // x to the power n Optimized (time complexity = O(logn))
    public static int x_optimized(int x, int n){
        if(n%2==0){
            if (n==1){
                return x;
            }
            int a=x_optimized(x, n/2);
            x=a*a;
        }
        else{
            if (n==1){
                return x;
            }
            int a = x_optimized(x, n/2);
            x=x*a*a; 
        }
        return x;   
    }
    // Tiling problem
    public static int tiling_problem(int n){
        if(n==0|n==1){
            return 1;
        }
        int vert = tiling_problem(n-1);
        int hori = tiling_problem(n-2);
        //total ways = hori+ vert
        int t =vert + hori;
        return t;
    }
    //Program to remove duplicates in a String (Important)
    public static StringBuilder remove_duplicates(String s,int i,StringBuilder sb, boolean map[]){
        if(i==s.length()){
            return sb;
        }
        if(map[s.charAt(i)-'a']==false){
            sb.append(s.charAt(i));
            map[s.charAt(i)-'a']=true;
        }
        remove_duplicates(s, i+1,sb, map);
        return sb;
    }
    // Friends pairing program 
    public static int friends_pairing(int n){
        //choices
        //1. single
        int single = friends_pairing(n-1);
        //2. pair
        int pair = (n-1)*friends_pairing(n-2);
        //3.total ways
        int ways = single+pair;
        return ways;
    }
    // Print all binary strings of size N without consecutive ones(1)
    public static void binary_strings(int n,int lastplace, String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        //task
        binary_strings(n-1, 0, s+"0");
        if(lastplace==0){
            binary_strings(n-1, 1, s+"1");
        }
    }
    // Program to find all occurances of a given key in a given array
    public static void find_all_occurances(int arr[], int k, int n){
        if(n<arr.length){
            if(arr[n]==k){
                System.out.print(n+" ");
            }
            find_all_occurances(arr, k,n+1 );
        }
    }
    // To print english words for a given number
    public static StringBuilder english_words(int  n,StringBuilder sb, String map[]){
        if(n==0){
            return sb;
        }
        int s = n%10;
        english_words(n/10, sb, map);
        sb.append(map[s]+" ");
        return sb;
    }
    // To find the count of all contiguous substrings
    // i.e substrings that start and end with the same letter
    
      
    public static void main(String args[]){
        
    }
}
