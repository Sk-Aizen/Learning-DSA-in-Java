// FOR ALL PROGRAMS SEE NOTES ALSO FOR BETTER UNDERSTANDING
public class Divide_and_Conquer {
    public static void print_array(int array[]){
        int j = 0;
        while(j<array.length){
            System.out.print(array[j]+" ");
            j++;
        }    
    }
    // MERGE SORT
    public static void mergesort(int arr[],int s, int e){
        //base case
        if(s>=e){
           return;
        }
        // task
        int mid = s+(e-s)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);
        merge(arr,s,mid,e);
        
    }
    public static void merge(int arr[],int s, int mid, int e){
        int temp[]= new int[e-s+1];
        int i = s; // iterator 1 for left part
        int j = mid+1; // iterator 2 for right part
        int k = 0; // iterator for temp array
        while (i<=mid & j <=e){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        // There will be a last part which is leftover after the
        // left side is sorted. To add them we write this code
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        // Copying temp to original
        for(i=0,k=s;i<temp.length;i++,k++){
            arr[k]=temp[i];
        }
    }
    // QUICK SORT
    public static void quick_sort(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int pivot_index = partition(arr, s, e);
        quick_sort(arr, s, pivot_index-1); //left part
        quick_sort(arr,pivot_index+1, e); //right part
    }
    public static int partition(int arr[],int s,int e){
        int less = s; // to make place for nos smaller than pivot
        int pivot = arr[e];
        for(int i = s;i< e;i++){
            if(arr[i]<=pivot){
                int temp =arr[i];
                arr[i] = arr[less];
                arr[less] = temp;
                less++;
            }
        }
        int temp =pivot;
        arr[e] = arr[less];
        arr[less] = temp; 
        return less;
    }
    // SEARCH IN ROTATED SORTED ARRAY
    public static int search(int arr[], int t, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]== t){
            return mid;
        }
        // mid on l1
        if(arr[s]<=arr[mid]){
            // case a, left part of l1
            if(arr[s]<=t  && t<=arr[mid]){
                 return search(arr, t, s, mid-1);
            }
            // case b, right part of mid (entirely)
            else{
                return search(arr, t, mid+1, e);  
            }
        }
        // mid on l2
        else{
            // case c, right part of l2
            if( arr[mid]<=t && t<=arr[e]){
                return search(arr, t, mid+1, e);  
            }
            // case d, left part of mid (entirely)
            else{
                return search(arr, t, s, mid-1);
            }
        }
    }
    // Return the most occuring element from a given array
    public static int count(int arr[], int s, int e, int num){
        int count=0;
        for(int i =s;i<=e;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public static int return_majority(int arr[], int s, int e ){
        // Base case, only element array - it is the majority
        if(s>=e){
            return arr[s];
        }
        // recurse on left and right parts
        int mid = s+(e-s)/2;
        int left = return_majority(arr, s, mid);
        int right = return_majority(arr, mid+1, e);
        // if two halves give same majority element, return it
        if(left == right){
            return left;
        }
        // Else, count the majority in both and return the 'winner'
        int leftcount = count(arr, s, e, left);
        int rightcount = count(arr, s, e, right);
        return leftcount > rightcount ? left : right;
    }
    public static void main(String args[]){
        
        
    }
}
