import java.util.concurrent.TimeUnit;

class SDArrayDriver extends SDArray {
    public static void main(String[] args){

        //Look up by index
        long startTime = System.nanoTime();
        SDArray lookupEx = new SDArray();
        System.out.println(lookupEx.checkIndexOfArray(lookupEx.createArray(), 4));
        long endTime = System.nanoTime();
        System.out.println("Time elapsed for looking up an element an Array in O(1): " + lookupEx.timeIt(startTime, endTime) + "\n");
        

        //Deletion by index
        startTime = System.nanoTime();
        SDArray deletionEx = new SDArray();
        int[] ex = deletionEx.createArray();
        System.out.println("Old Array");
        deletionEx.printArray(ex);
        System.out.println("\nNew Array");
        //this function will select the index you want to delete and shift everything over
        //you can't resize an array so the last numbers will be duplicated
        deletionEx.printArray(deletionEx.deleteElementOfArray(ex, 0, true));
        endTime = System.nanoTime();
        System.out.println("\nTime elapsed to delete an element from an Array in O(N) with shifting: " + deletionEx.timeIt(startTime, endTime) + "\n");

        //Insertion
        startTime = System.nanoTime();
        SDArray insertEx = new SDArray();
        ex = insertEx.createArray();
        System.out.println("Old Array");
        insertEx.printArray(ex);
        System.out.println("\nNew Array");
        // this function will select the index you want to delete and shift everything
        // over
        // you can't resize an array so the last numbers will be duplicated
        insertEx.printArray(insertEx.insertElementOfArray(ex, 32, 2));
        endTime = System.nanoTime();
        System.out.println("\nTime elapsed to insert an element from an Array in O(N) with shifting and copying -- Space Complexity O(N): "
                + insertEx.timeIt(startTime, endTime) + "\n");

    }
}