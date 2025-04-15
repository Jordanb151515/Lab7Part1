
/**
 * Write a description of class ArrayMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMethods{
    // instance variables - replace the example below with your own
    int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Constructor for objects of class ArrayMethods
     */
    public int count(){
        int size = 0;
        for(int number: myArray)
            size++;
        return size;
    }

    /**
     * Constructor for objects of class ArrayMethods
     */
    public int sum(){
        int sum = 0;
        for(int number: myArray)
            sum += number;
        return sum;
    }

    /**
     * Constructor for objects of class ArrayMethods
     */
    public double average(){
        double average = 0;
        average = (double)sum()/count();
        return average;
    }

    /**
     * Constructor for objects of class ArrayMethods
     */
    public int findMax(){
        int max = myArray[0];
        for(int i=1; i<myArray.length; i++){
            if(myArray[i]>max)
                max = myArray[i];
        }
        return max;
    }
    
    /**
     * Constructor for objects of class ArrayMethods
     */
    public int findIndexOfMax(){
        int max = myArray[0];
        int index = 0;
        for(int i=1; i<myArray.length; i++){
            if(myArray[i]>max){
                max = myArray[i];
                index = i;
            }
        }
        return index;
    }

    
}
