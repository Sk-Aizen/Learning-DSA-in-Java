import java.util.*;
public class ArraysCC {
    //Program for binary search
    public static int binarysearch(int marks[], int k){
        int start = 0;
        int end = marks.length - 1;
        while(start<=end){
            int mid= (start+end)/2;
            if(marks[mid]==k){
                return mid;
            }
            else if(marks[mid]>k){
                end = mid;
            }
            else{
                start=mid;
            }
        }
        return -1;
    }
    // Program for reversing an array without creating a new array
    public static void reverse_array(int array[]){
        int first = 0, last = array.length-1;
        while(first<last){
            int temp = array[first];
            array[first]=array[last];
            array[last]=temp;
            first++; 
            last--;
        } 
        int j = 0;
        while(j<array.length){
            System.out.println(array[j]);
            j++;
        }    
    }
    //Program for creating pairs of elements in an array without repetition
    public static void pairsinarray(int array[]){
        int tp = 0;
        for(int i = 0;i<=array.length-1;i++){
            for(int j = i;j<=array.length-1;j++){
                if (array[i]==array[j]){
                    continue;
                }
                else{
                System.out.print(array[i]+","+array[j]+"    ");
                tp++;
                }
            }
        System.out.println();
        }
        System.out.println("total pairs = "+tp);
    }
    //Hint:total pairs = [n(n-1)]/2 where n is no of elements

    //Program for printing all sub-arrays for a given array
    public static void sub_arrays(int array[]){
        for(int i = 0;i<array.length;i++){
            for(int j = i;j<array.length;j++){
                System.out.print("(");
                for (int k = i;k<=j;k++){
                    if(k==j){
                        System.out.print(array[k]);
                    }
                    else{
                        System.out.print(array[k]+",");
                    }
                }
                System.out.print(")");
                System.out.print("  ");
            }
        System.out.println();
        }
    }
    // Program to find max sum of subarrays using prefix array method
    public static void max_subarray_sum_prefix_array(int array[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        int prefix[]=new int[5];
        for(int i = 0;i<array.length;i++){
            int s=0;
            for(int j = 0;j<=i;j++){
                s+=array[j];
            }
            prefix[i]=s;
        }
        if(start ==0){
            System.out.print(prefix[end]);
        }
        else{
            System.out.print(prefix[end]-prefix[start-1]);
        }
        sc.close();
    }
    // Kadane's algorithm
    public static void Kadane_algo(int array[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE ;
        for(int i = 0;i<array.length;i++){
            cs+=array[i];
            if(cs<0){
                cs=0;
            }
            else if(cs>ms){
                ms=cs; 
            }
        }
        System.out.println("Maximum sub-array sum : "+ms);
    } 
    // Program for trapping rainwater
    public static void trapping_rainwater(int array[]){
        int n=array.length;
        if(n<3){
            System.out.println("No water can be trapped");
        }
        //left max border
        int left_border = Integer.MIN_VALUE;;
        int left_max_border[]= new int[n];
        for(int i = 0;i<n;i++){
            if (array[i]>left_border){
                left_border=array[i];
            }
            left_max_border[i]=left_border;
        }
        //right max border
        int right_border = Integer.MIN_VALUE;
        int right_max_border[]= new int[n];
        for(int i =n-1;i>=0;i--){
            if(array[i]>right_border){
               right_border=array[i];
            }
            right_max_border[i]=right_border;
        }
        //finding trapped water
        int trapped_water=0;
        for(int i = 0;i<n;i++){
            int water_level = Math.min(left_max_border[i], right_max_border[i]);
            trapped_water += water_level - array[i];
        }
        System.out.println("Trapped water is: " + trapped_water);
    }
    public static void max_profit_stocks(int prices[]){
        int n = prices.length;
        int max_profit =Integer.MIN_VALUE;
        int buying_price=Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            buying_price=Math.min(prices[i],buying_price);
            int profit=prices[i]-buying_price;
            max_profit=Math.max(max_profit, profit);
        }   
        System.out.println(max_profit);
    }
    public static void main(String args[]){
        
    } 
}
