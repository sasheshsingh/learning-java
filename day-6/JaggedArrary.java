public class JaggedArrary {
    public static void main(String args[]){
        int[][] nums = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[9];
        nums[2] = new int[5];
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
