public class Linear_Search {
    public static void main(String[] args) {
        int[] array = {4,5,6,3,6,8,7,1,2,7};

        int index = linearSearch(array,11);


        if (index != -1){
            System.out.println("Element Found at"+ index);

        }else{
            System.out.println("Element didnt found ");

        }




    }

    private static int linearSearch(int[] array, int values) {
        for (int i = 0; i < array.length; i++){
            if (array[i] ==values ){
                return i;
            }
        }
        return -1;
    }
}
