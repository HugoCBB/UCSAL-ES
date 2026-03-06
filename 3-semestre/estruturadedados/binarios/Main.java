
public class Main {
    public static void main(String[] args) {
        int[] num  = new int[]{1,1,1};
        int numConvert = convertToDecimal(num, 8);
        System.out.println(numConvert);
    }

    public static int convertToDecimal(int[] nums,  int base) {
        // Performance O(n)
        int[] array = reverseArray(nums);
        int calc = 0;
        
        for(int i = 0; i < array.length; i++){
            calc += array[i] * (Math.powExact(base, i)); 
        }
        return calc;
        
    }

    public static int[] reverseArray(int[] nums) {
        // Performance O(n)
        int[] newArray = new int[nums.length];
        int aux = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            newArray[aux] = nums[i];
            aux++;
        }
        return newArray;
    }
}