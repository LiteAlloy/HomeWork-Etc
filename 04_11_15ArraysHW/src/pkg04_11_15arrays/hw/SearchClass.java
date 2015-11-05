package pkg04_11_15arrays.hw;

public class SearchClass {

    public void firstSearch() {
        int[] firstSearchArray = new int[6];

        int toFind = (int) (Math.random() * 10);
        System.out.println("\nЧисло для первого поиска: " + toFind);

        for (int i = 0; i < firstSearchArray.length; i++) {
            firstSearchArray[i] = (int) (Math.random() * 10);
            System.out.println(firstSearchArray[i]);
        }

        for (int i = 0; i < firstSearchArray.length; i++) {
            if (firstSearchArray[i] == toFind) {
                System.out.println("Индекс числа в массиве: " + i
                        + "; Порядковый номер: " + (i + 1));
            }
        }

    }

    public void secondSearch() {

        int[] secondSearchArray = new int[10];

        System.out.println("\nВторой массив, неотсортированный: ");
        for (int i = 0; i < secondSearchArray.length; i++) {
            secondSearchArray[i] = (int) (Math.random() * 10);
            System.out.println(secondSearchArray[i]);
        }

        int toFind = (int) (Math.random() * 10);
        System.out.println("\nЧисло для второго поиска: " + toFind);

        System.out.println("\nВторой массив, отсортированный: ");
        for (int i = secondSearchArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (secondSearchArray[j] > secondSearchArray[j + 1]) {
                    int change = secondSearchArray[j];
                    secondSearchArray[j] = secondSearchArray[j + 1];
                    secondSearchArray[j + 1] = change;
                }
            }
        }
        for (int i = 0; i < secondSearchArray.length; i++) {
            System.out.println(secondSearchArray[i]);
        }

        for (int i = 0; i < secondSearchArray.length / 2; i++) {
            if (toFind <= secondSearchArray[secondSearchArray.length / 2]) {
                if (secondSearchArray[i] == toFind) {
                    System.out.println("Индекс числа в массиве: " + i
                            + "; Порядковый номер: " + (i + 1));
                    System.out.println("Поиск проводился в первой половине массива.");
                }
            }
        }
        for (int j = secondSearchArray.length / 2; j < secondSearchArray.length; j++) {
            if (toFind >= secondSearchArray[secondSearchArray.length / 2]) {
                if (secondSearchArray[j] == toFind) {
                    System.out.println("Индекс числа в массиве: " + j
                            + "; Порядковый номер: " + (j + 1));
                    System.out.println("Поиск проводился во второй половине массива.");
                }
            }
        }
    }
}
