package Arrays;

public class CalculationMultiD {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 4}, {35, 45, 56}, {454, 3, 54}};
        int mat2[][] = {{1, 2, 3}, {23, 2, 13}, {23, 43, 4}};
        int mat3[][] = new int[3][3];

        //addition

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat3[i][j] = mat[i][j] + mat2[i][j];
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
