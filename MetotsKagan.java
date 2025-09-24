import java.util.Arrays;

public class MetotsKagan {
    
    static public int MinOfArray(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static public int MaxOfArray(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static public void DifferFromAvarageOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average =(double)sum/arr.length; 
        double[] differArr = new double[arr.length];
        int[] differ = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            differArr[i]=arr[i]-average;
        }
        System.out.println(Arrays.toString(differArr));
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 9, 3, 5};
        System.out.println(MinOfArray(array));
        System.out.println(MaxOfArray(array));
        DifferFromAvarageOfArray(array);
    }

}
