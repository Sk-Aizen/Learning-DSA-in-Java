public class TwoDimensionalArrays{

    public static void printmatrix(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void printspiral(int mat[][]){
        int startrow = 0;
        int endrow = mat.length-1;
        int startcol = 0;
        int endcol = mat[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j = startcol;j<=endcol;j++){
                System.out.println(mat[startrow][j] + " ");
            }
            //right
            for(int i = startrow+1;i<=endrow;i++){
                System.out.println(mat[i][endcol] + " ");
            }
            //bottom
            for(int j = endcol-1;j>=startcol;j--){
                System.out.println(mat[endrow][j] + " ");
            }
            //left
            for(int i = endrow-1;i>startrow;i--){
                System.out.println(mat[i][startcol] + " ");
            }
            startrow+=1;
            endrow-=1;
            startcol+=1;
            endcol-=1;
        }
    }
    public static void diagnolsum(int arr[][]){
        int s = 0;
        for(int i = 0;i<arr.length;i++){
            s+=arr[i][i];
            if(i!=arr.length-1-i){
                s+=arr[i][arr.length-1-i];
            }
        }
        System.out.print(s);
    }
    
    public static void staircase_search_matrix(int mat[][], int k){
        int row = mat.length-1;
        int col = 0;
        while (true){
            if (k>mat[row][col]){
                col++;
            }
            else if (k<mat[row][col]){
                row--;
            }
            else if(k==mat[row][col]){
                System.out.print(row+","+col);
                break;
            }
        }
    }

    public static void Transpose_matrix(int mat[][]){
        int transpose[][]=new int[mat[0].length][mat.length];
        for(int i = 0;i<transpose.length;i++){
            for(int j = 0;j<transpose[0].length;j++){
                transpose[i][j]=mat[j][i];
            }
        }
        printmatrix(transpose);
    }

    public static void main(String args[]){
        int matrix[][]={};
        
        
        
        
    }
}