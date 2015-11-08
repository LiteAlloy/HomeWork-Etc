package pkg04_11_15arrays.hw;

public class FailSpiral {

    public void failadSpiral() {
        int f = 5;
        int g = f;
        int[][] asd = new int[f][f];
        int spot = 1;

        for (int j = 0; j < 2; j++) {
            int col = 0;
            int row = 0;
            for (int i = 0; i < f; i++) {
                row = i;
                asd[col][row] = spot;
                spot++;
                System.out.println("1 cicle: col = " + col + ": row = " + row);
            }

            for (int i = 0; i < f; i++) {
                col = i + 1;
                row = f - 1;
                if (i != f - 1) {
                    asd[col][row] = spot;
                    spot++;
                    System.out.println("2 cicle: col = " + col + ": row = " + row);
                }
            }
            g--;

            for (int i = 1; i < f; i++) {
                col = g;
                row = g - i;
                asd[col][row] = spot;
                spot++;
                System.out.println("3 cicle: col = " + col + ": row = " + row);
            }

            for (int i = 1; i < f; i++) {
                if (g - i != row) {
                    asd[g - i][row] = spot;
                    spot++;
                    System.out.println("4 cicle: col = " + col + ": row = " + row);
                }
            }
            col++;
            row++;
            f--;
        }
        for (int[] a1 : asd) {
            for (int a2 : a1) {
                System.out.print(String.format("%3d", a2));
            }
            System.out.println();
        }
    }
}
