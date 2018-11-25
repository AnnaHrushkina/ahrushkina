package Class6;

public class lesson6 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        reverseArr(arr); // вводим нужную функцию
        System.out.println(); // выводим результат
        System.out.println(maxElement(arr) + " is max"); // для максимального числа
    }


    public static int findIndex(int[] a, int b) { // задание 1

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;

    }
/* не понятно
   public static int findIndex2(int[] a, int b) { // задание 2;
        while (b < 15 ) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b) {
                    return i;
                }
            }
    }
    return -1;

}
*/
    public static int everySecond(int[] a) { // задание 3

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println("element is " + i);
            }
        }
        return -1;
    }

    public static int maxElement(int[] a){ // задание 4
        int max = 0;
        for(int i = 0; i <= a.length; i++){
            if(i > max){
                max = i;
            }
        }
        return max;
    }


    public static int eachElement(int[] a){ // задание 5
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] +  " ");
        }
        return -1;
    }

    public static int reverseArr(int[] a){
        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        return 0;
    }
}




