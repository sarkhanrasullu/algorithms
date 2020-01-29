public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        long dt1 = System.nanoTime();

        for(int firstUnsortedIndex=1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];
            int lastPositionOfNewElement = firstUnsortedIndex;

            for(int i=firstUnsortedIndex-1;i>=0;i--){

                if(newElement < intArray[i]){
                    intArray[i+1] = intArray[i];
                    lastPositionOfNewElement = i;
                }

            }

            intArray[lastPositionOfNewElement] = newElement;

        }

        long dt2 = System.nanoTime();
        System.out.println("diff="+(dt2-dt1));

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        if(i==j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
