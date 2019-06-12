import java.lang.*;
import java.util.*;
import java.util.stream.*;


class SDArray implements SDArrayInterface{
    public int checkIndexOfArray(int[] arr, int index){
        return arr[index];
    }

    public int[] deleteElementOfArray(int[] arr, int index, boolean byIndex){
        if(byIndex){
            for(int i = index, j = index + 1; i < j && j < arr.length; i++, j++){
                arr[i] = arr[j];
            } 
        }
        return arr;
    }

    public int[] insertElementOfArray(int[] arr, int numberToAdd, int indexAt){
        int[] answer = new int[arr.length + 1];
        for(int i = 0, j = 0; i < arr.length; i++, j++){
            if(i == indexAt){
                answer[j] = numberToAdd;
                j++;
            }
            answer[j] = arr[i];
        }
        return answer;
    }
}