public class Main {
    public static void main(String[] args) {
        int[] arr1 ={10,2,6,10,5,2,3,10,2,6,2,6,6,6};
        int count1 =0;
        int count2 =0;
        int val =0;
        for(int i=0;i< arr1.length;i++){
            for(int j=i+1;j< arr1.length;j++){
                if (arr1[i] == arr1[j]){
                    count1++;
                }
            }
            if (count2 < count1){
                count2 = count1;
                val = arr1[i];
                count1=0;
            }
            count1=0;
        }
        System.out.println(count2 +" " + val);
    }
}