public class JavaArray {
    public static void main (String args []){

        int totalNum = 0;
        int [] num = {23, 34, 54, 65, 56};
        for(int i = 0; i < num.length; i++){
            //System.out.println(num[i]);
            totalNum = totalNum + num[i];

            System.out.println(totalNum);
        }

    }
}