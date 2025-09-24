public class SumOfElements {
    public static String ElementsSum(int[] elementList){
        int arraylength = elementList.length;
        int sumOfOdds = 0;
        int sumOfEvens = 0;
        for(int i = 0; i < arraylength; i++){
            if(i%2 == 1){
                sumOfOdds =+ i;
            }
            else{
                sumOfEvens =+ i;
            }
        }
        return "Summ of odd numbered indexes is: " + sumOfOdds +" \nSum of even numbered indexes is: " + sumOfEvens;
    }
}
