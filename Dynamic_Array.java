public class Dynamic_Array {
    public static void main(String[] args) {

        Dynamic_Array dynamicArray = new Dynamic_Array(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

      //  dynamicArray.insert(0,"X");
//        dynamicArray.delete("A");
//        dynamicArray.delete("B");
//        dynamicArray.delete("C");
//        dynamicArray.delete("D");


        System.out.println(dynamicArray);
        System.out.println("Search: "+ dynamicArray.search("C"));
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);



    }

    int size;
    int capacity = 10;
    Object[] array;

    public Dynamic_Array(){
        this.array = new Object[capacity];
    }
    public Dynamic_Array(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public Object get(int index){
        return array[index];
    }

    public void add(Object data){

        if (size >= capacity){
            grow();
        }
        array[size] = data;
        size++;

    }

    public void insert(int index, Object data){
        if (size >= capacity) {
            grow();
        }
        for (int i = size ; i > index ; i--){
            array[i] = array [i - 1];
        }
        array[index] =data;
        size++;

    }

    public void delete(Object data){

        for (int i = 0; i < size ; i++){
            if (array[i] == data){
                for (int j = i; j < size -1;j++){
                    array[j] = array[  j + 1];
                }
                array[size -1] = null;
                size--;
                if (size <= (int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }

    }

    private int search(Object data){

        for (int i =0 ; i < size; i++){
            if (array[i] == data){
                return i;
            }
        }

        return -1;
    }

    private void grow(){
        int newCapacity = (int)(capacity * 2);
        Object[]newArray = new Object[newCapacity];

        for (int i = 0; i < size ; i++){
            newArray[i] =array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }

    private void shrink(){
        int newCapacity = (int)(capacity / 2);
        Object[]newArray = new Object[newCapacity];

        for (int i = 0; i < size ; i++){
            newArray[i] =array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){


        String string = "";
        for (int i = 0; i < capacity; i++){
            string += array[i] + ", ";
        }
        if (string != ""){
            string = "[" + string.substring(0,string.length() -2) +"]";
        }
        else {
            string = "[ ]";
        }
        return string;
    }

}
