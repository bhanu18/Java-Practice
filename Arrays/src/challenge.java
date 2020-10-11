import java.util.Scanner;

public class challenge {

    public static void main(String[] args) {

        int[] myArray = getInteger(5);
        int[] sortArray = sortIntegers(myArray);
        printArray(sortArray);
    }
    private static Scanner console = new Scanner(System.in);

    public static int[] getInteger(int capacity){
        int[] value = new int[capacity];
        for(int i=0; i< value.length; i++){
            System.out.println("Enter "+capacity+" integer value:\r");
            value[i]= console.nextInt();
        }
        return value;
    }
    public static void printArray(int[] value){
        for(int i=0; i<value.length;i++){
            System.out.println("Element "+i+" contents "+ value[i]);
        }
    }
    public static int[] sortIntegers(int[] value){
        int[] sortArray = new int[value.length];
        for(int i=0; i< value.length; i++){
            sortArray[i]= value[i];
        }
        boolean flag= true;
        int temp;
        while (flag){
            flag=false;
            for (int i=0; i< sortArray.length-1; i++){
                if(sortArray[i]< sortArray[i+1]){
                    temp= sortArray[i];
                    sortArray[i]= sortArray[i+1];
                    sortArray[i+1]= temp;
                    flag=true;
                }
            }
        }
        return sortArray;
    }
}
