import java.util.Random;

interface SDArrayInterface {
    default long timeIt(long start, long end){
        return end - start;
    }

    default int[] createArray(){
        //An array can also be created using the style
        // int[] newArr = {1,2,4,5,6};
        //this style automatically dictates size according to inputed data

        //new random number object
        Random randomObject = new Random();

        //new array with size 10
        int[] newExample = new int[10];

        for(int i = 0; i < newExample.length; i++){
            // now we select a range for it to grab a new number
            // it will select this number from the nextIng method
            int randomNumber = randomObject.nextInt(100);
            newExample[i] = randomNumber;

        }

        return newExample;
    }
    
    default void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public int[] deleteElementOfArray(int[] arr, int index, boolean byIndex);

    public int[] insertElementOfArray(int[] arr, int numberToAdd, int indexAt);
}