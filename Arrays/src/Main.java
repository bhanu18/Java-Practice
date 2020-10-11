import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0 ; i< myIntegers.length; i++){
            System.out.println("Element "+ i +", type value was "+ myIntegers[i]);
        }
        System.out.println("the average is "+ getAverage(myIntegers));

    }

    public static int[] getIntegers(int numbers){
        System.out.println("Enter "+numbers+ " integer value.\r");
        int[] value = new int[numbers];

        for (int i=0; i< value.length; i++){
            value[i]= scanner.nextInt();
        }
        return value;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum+= array[i];
        }
        return (double) sum / (double)array.length;
    }
}
