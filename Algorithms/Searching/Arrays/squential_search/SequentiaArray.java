class SequentialArray implements Finder {
    int[] arr;
    //constructor
    public SequentialArray (int size){
        arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = i+3;
        }
    }

    public int search (int target, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found it using Sequential Search!!! -> index: " + i);
                return arr[i];
            }
        }

        return -1;
    }
}