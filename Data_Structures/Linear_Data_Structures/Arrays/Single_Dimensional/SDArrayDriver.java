import java.util.concurrent.TimeUnit;

class SDArrayDriver extends SDArray {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        SDArray example = new SDArray();
        System.out.println(example.checkIndexOfArray(example.createArray(), 4));
        long endTime = System.nanoTime();
        System.out.println("Time elapsed for searching an Array in O(1) : " + example.timeIt(startTime, endTime));

    }
}