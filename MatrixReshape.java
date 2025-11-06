public class MatrixReshape {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row* col != r*c) return mat;

        int [][] result = new int[r][c];
        int count = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[count/c][count%c] = mat[i][j];
                count++;
            }
        }
        return result;
    }
}

// 2D array Matrix problem