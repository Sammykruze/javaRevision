public class JavaArray {
    public static void main (String args []){

        int totalNum = 0;
        int [] nums = {23, 67, 98, 65, 89, 56, 57};
        for(int i = 0; i < nums.length; i++){
            //System.out.println(num[i]);
            totalNum = totalNum + nums[i];

            System.out.println(totalNum);
        }

    }
}
