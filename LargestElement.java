public class LargestElement {
    public static void main(String[]args){

        int[] arr={11,10,25,45,55,14};
        int largestNum=0;
        for(int i=0;i<arr.length;i++){
            if(largestNum<arr[i]){
                largestNum=arr[i];
            }


        }System.out.println(largestNum);


    }
}
