package pkg04_11_15arrays.hw;

public class TestStart {

    public static void main(String[] args) {
        
        System.out.println("Сортировка массива:\n");
        SortClass sc = new SortClass();
        sc.firstSort();
        sc.secondSort();
        
        System.out.println("\n\nПоиск числа в массиве:");
        SearchClass seacl = new SearchClass();
        seacl.firstSearch();
        seacl.secondSearch();
        
        System.out.println("\nЗаполнение массива по спирали:");
        ArraySpiralFill asf = new ArraySpiralFill();
        asf.fillTheArray();
    }
}
