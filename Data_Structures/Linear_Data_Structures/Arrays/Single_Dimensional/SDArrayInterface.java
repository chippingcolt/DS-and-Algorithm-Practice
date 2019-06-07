import java.util.Random;

interface SDArrayInterface {
    default long timeIt(long start, long end){
        return end - start;
    }

    default int[] createArray(){
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
}