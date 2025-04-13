public class Array {
    public static void main(String args[]){
        int nums[] = {1, 4, 9, 10, 50};
        System.out.println(nums[2]);
        nums[2] = 90;
        System.out.println(nums[2]);
        int dynamicArray[] = new int[4];
        dynamicArray[0] = 0;
        dynamicArray[1] = 0;
        dynamicArray[2] = 0;
        dynamicArray[3] = 0;
        for (int i=0;i<4; i++){
            System.out.println(dynamicArray[i]);
        }
    }
    
}
