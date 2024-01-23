public class Main2 {
    public static void main(String[] args) {
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        int[] array = {1,1,0,1,1,1};
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                count++;
                if (count > max_count){
                    max_count = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println("Максимальное количество идущих подряд = " + max_count);
    }
}
