package codingWithMosh;

public class Array {

    private int[] array;
    private int count;
    public Array(int length) {
        array = new int[length];
    }

    public void insert(int element) {

        if (array.length == count) {
            int[] temp = new int[count*2];
            for (int i=0; i < count; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[count++] = element;
    }

    public void removeAt(int index) {
        if (index < 0 || index >=count) {
            throw new IllegalArgumentException();
        }
        for (int i=index; i<count; i++) {
            array[i] = array[i+1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i<count; i++) {
            if (array[i] == item)
                return i;
        }
        return -1;
    }

    public int max(){
        int max = 0;
        for (int i=0; i <count; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public int[] intersect(int[] secArr){
        int temp[] = new int[secArr.length];
        int tempCount = 0;
        for(int i = 0; i < array.length; i++){
            for (int j=0; j < secArr.length; j++) {
                if (array[i] == secArr[j]){
                    temp[tempCount++] = secArr[j];
                }
            }
        }
        return temp;
    }

    public void reverse(){
        if (array.length < 2 || array == null){
            return;
        }

        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length -1 - i];
            array[array.length - 1 -i] = temp;
        }

    }

    public void insertAt(int index, int item){
        if (index < 0 || index >=count) {
            throw new IllegalArgumentException();
        }

        for (int i = count -1; i >= index -1; i--){
            array[i+1] = array[i];
        }
        array[index - 1] = item;
    }

    public void print() {
        for (int i =0; i<count ;i++){
            System.out.println(array[i]);
        }
    }
}
