package Class6;

public class Page2 {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 3, 55, 12, 6, 7, 8, 9, 12, 11, 112, 9, 55, 13, 14, 1111};

        //System.out.println(Average(arr));
        //delElem(arr, 112);
        //insertElement(arr, 23232);
        //findRepeatable(arr);
        //removeDuplicates(arr);
       // reverseArr(arr);
        sumArrays(arr, reverseArr(arr));

    }


    public static float Average(int[] a) { // задание 1
        int sum = 0;
        int count = 0;
        float average;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            count++;
        }
        average = (float) sum / count;
        return average;
    }

    public static int[] delElem(int[] a, int element) { // задание 2
        int cursor = 0;
        int[] arr = new int[a.length - 1];
        for (int i = 0; i < element; i++)
            if (a[i] != element) {
                arr[i] = a[i];
                cursor++;
            } else {
                break;
            }
        for (int i = cursor; i < a.length - 1; i++) {
            arr[i] = a[i + 1];

        }
        /*for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }*/
        return arr;
    }

    public static int[] copyArr(int[] a) { // задание 3
        int[] new_arr = new int[a.length];
        for (int i = 0; i <= a.length; i++) {
            new_arr[i] = a[i];
        }
        return new_arr;
    }

    public static int[] insertElement(int[] a, int element) { // задание 4
        int[] arr = new int[a.length + 1];
        int cursor = 0;
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
            cursor++;
        }
        arr[cursor] = element;
        return arr;
    }

    public static int[] reverseArr(int[]src) { // задание 5
        int[] dst = new int[src.length];
        int rCursor = 0;
        for (int i = src.length - 1; i >= 0; i--) {
            dst[rCursor] = src[i];
            rCursor++;
        }
        return dst;
    }

    public static int findRepeatable(int[]a){ // задание 6
        for(int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++)
                if (i != j && a[i] == a[j]) {
                    System.out.println(a[i] + " is duplicate");

                }
        }
        return -1;


    }

    public static int[] findMatches(int[] left, int[] right) { // задание 7
        int numberofMatches = 0;

        for (int i = 0; i < left.length; i++) {
            int leftValue = left[i];
            for (int j = 0; j < right.length; j++) {
                int rightValue = right[i];
                if (leftValue == rightValue) {
                    numberofMatches++;
                    break;
                }
            }
        }
        if (numberofMatches == 0) {
            return null;
        }
        int[] matches = new int[numberofMatches];
        int matchesIndex = 0;
        for (int i = 0; i < left.length; i++) {
            int leftValue = left[i];
            for (int j = 0; j < right.length; j++) {
                int rightValue = right[i];
                if (leftValue == rightValue) {
                    matches[matchesIndex++] = leftValue;
                    break;
                }
            }
        }
        return matches;


    }

    public static int removeDuplicates(int[] a){ // задание 8 не понятно
        int duplicateCount = 0;
        int dupArrCursor = 0;


        for(int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++)
                if (a[i] == a[j]) {
                    ++duplicateCount;
                    break;
                }

        }

        int[] newArr = new int[a.length - duplicateCount];
        int[] duplicateArr = new int[duplicateCount];


        for(int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++)
                if (i != j && a[i] == a[j]) {
                    duplicateArr[dupArrCursor] = a[i];
                    dupArrCursor++;
                }
        }
        for (int i = 0; i < a.length; i++){
        }
        //for (int i = 0; i < duplicateArr.length; i++){
        //    System.out.println(duplicateArr[i]);
        //}

        return -1;
    }

    public static int sumArrays(int[]a, int[]b){ // задание 9
        int count1 = 0;
        int count2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
            count1++;
        }
        for (int i = 0; i < b.length; i++){
            sum2 = sum2 + b[i];
            count2++;
        }
        int sumArr = sum1 + sum2;

        return sumArr;

    }

    public static int findRepeatableLength(int[]a){ // задание 14 не дописано 
        for(int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++)
                if (i != j && a[i] == a[j])
                    int[] newArr = new int[];

                {
                    System.out.println(newArr.length);

                }
        }
        return -1;
    }


    public static void arrayLeftRotation(int[] a, int b) { // задание 16
        for (int i = 1; i <= b; i++) {
            int[] arr = rotate(a, i);
            System.out.println(Arrays.toString(arr));
        }

    }
    private static int[] rotate(int[] a, int b) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int ind = i + b;
            arr[i] = a[ind >= a.length ? ind - a.length : ind];
        }
        return arr;
    }
}









