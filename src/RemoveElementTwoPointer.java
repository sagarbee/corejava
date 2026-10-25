public class RemoveElementTwoPointer {

    public static void main(String[] args) {
        int [] array = {3,4,2,3,4,2};
        removeElement(array,2);
    }

    public static void removeElement(int[] array,int value){
        System.out.println("Length of array is :: "+array.length);
        if(array == null || array.length == 0) return;

        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if(array[j] != value){
                array[i] = array[j];
                i++;
            }

        }
        System.out.println("New length of array is :: "+i);
    }

}
