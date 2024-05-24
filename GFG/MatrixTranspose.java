//Write a java program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

class MatrixTranspose {
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         int[][] transpose = new int[3][3];
//         for(int i=0;i<3;i++) {
//             for(int j=0;j<3;j++) {
//                 transpose[i][j] = arr[j][i];
//             }
//         }
//         for(int i=0;i<3;i++) {
//             for(int j=0;j<3;j++) {
//                 System.out.print(transpose[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

public void transpose(int n, int a[][]){
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            int temp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = temp;
        }
    }
}
public void printMatrix(int n, int a[][]){
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
public static void main(String args[]) {
    int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
    MatrixTranspose obj = new MatrixTranspose();
    obj.transpose(3,a);
    obj.printMatrix(3,a);
}
}