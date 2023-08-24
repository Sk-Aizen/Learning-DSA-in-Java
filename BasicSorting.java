public class BasicSorting {
    public static void print_array(int arr[]){
        int j=0;
        while(j<arr.length){
            System.out.print(arr[j] + " ");
            j++;
        }
    }
    public static void bubble_sort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print_array(arr);
    }
    public static void selection_sort(int arr[]){
        
        for(int i = 0;i<arr.length-1;i++){
            int min_position=i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min_position]>arr[j]){
                    min_position=j;
                }
            }
            int temp=arr[min_position];
            arr[min_position]=arr[i];
            arr[i]=temp;
        }
        print_array(arr);
    }
    public static void insertion_sort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        print_array(arr);
    }
    public static void counting_sort(int arr[]){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        int count[]= new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[k]=i;
                count[i]--;
                k++;
            }
        }
        print_array(arr);
    }
    public static void main(String args[]){
        int array[]={1,4,1,3,2,4,3,7};
        counting_sort(array);
    }
}
