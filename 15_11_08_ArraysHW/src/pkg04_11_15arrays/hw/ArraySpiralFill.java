package pkg04_11_15arrays.hw;

public class ArraySpiralFill {
    
    public void fillTheArray(){
        int col = 6;
        int row = 6;

        int[][] asd = new int[col][row];

        int col_index = col - 1;
        int row_index = row - 1;

        int steps = 1;
        int current_col = 0;
        int current_row = 0;
        int p = 0;

        while (steps != col * row) {

            while (current_row < row_index) {
                asd[current_col][current_row] = steps++;
                current_row++;
            }

            while (current_col < col_index) {
                asd[current_col][current_row] = steps++;
                current_col++;
            }

            while (current_row > p) {
                asd[current_col][current_row] = steps++;
                current_row--;
            }

            col_index--;
            row_index--;
            p++;

            while (current_col > p) {
                asd[current_col][current_row] = steps++;
                current_col--;
            }
        }

        if (steps == col * row) {
            asd[current_col][current_row] = steps++;
        }
        for (int[] a1 : asd) {
            for (int a2 : a1) {
                System.out.print(String.format("%3d", a2));
            }
            System.out.println();
        }
    }    
}