package pkg04_11_15arrays.hw;

public class SortClass {

    public void firstSort() {

        int[] firstArray = {4, 8, 29, 5, 23, 12};
        System.out.println("Первый массив:");
        for (int index : firstArray) {
            System.out.println(index);
        }
        for (int i = firstArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (firstArray[j] > firstArray[j + 1]) {
                    int change = firstArray[j];
                    firstArray[j] = firstArray[j + 1];
                    firstArray[j + 1] = change;
                }
            }
        }

        System.out.println("\nОтсортированный первый массив:");
        for (int al : firstArray) {
            System.out.println(al);
        }
        System.out.println();

    }

    public void secondSort() {
        int[] secondArray = new int[6];

        System.out.println("Второй массив:");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 100);
            System.out.println(secondArray[i]);
        }
        
        for (int i = 0; i < secondArray.length; i++) {
            int lowest = secondArray[i];
            int lowest_index = i;

            for (int j = i + 1; j < secondArray.length; j++) {
                if(secondArray[j] < lowest) {
                    lowest = secondArray[j];
                    lowest_index = j;
                }
            }
            if(i!= lowest_index){
                int change = secondArray[i];
                secondArray[i] = secondArray[lowest_index];
                secondArray[lowest_index] = change;
            }
            
            }
        System.out.println("\nОтсортированный второй массив:");
            for(int i = 0; i < secondArray.length; i++){
                System.out.println(secondArray[i]);
        }
        
    }
}
