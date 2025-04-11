package src;

public class MatrixNumbers {
    public static void main(String[] args) {
        //1 2 3
        //4 5 6
        //2X3 matris demektir
        //ilk [] satır sayısı, ikinci [] sütun sayısı

        int[][] matrix = new int[2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        //Matris Transpoz:
        //2X3 matrisi 3X2 yapmaktır
        //1 4
        //2 5
        //3 6
        int[][] transpoz = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.println(matrix[i][j]);
                transpoz[j][i] = matrix[i][j];
            }
        }
        //System.out.println(transpoz);

    }
}
