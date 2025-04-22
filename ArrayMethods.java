import java.util.Arrays;
/**
 * This class holds methods relating to myArray. Count, sum, average, find max and index of max,
 * find last value, find all values, getter, copy array, print out statement, sort array, and reverse the array.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 4/15/25
 */
public class ArrayMethods{
    int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * This method counts the value in myArray.
     * 
     * @return the integer size of the array
     */
    public int count(){
        int size = 0;
        for(int number: myArray)
            size++;
        return size;
    }

    /**
     * This method totals the sum of all of the values in myArray.
     * 
     * @return the sum of all the values
     */
    public int sum(){
        int sum = 0;
        for(int number: myArray)
            sum += number;
        return sum;
    }

    /**
     * This method find the average of all the values in myArray.
     * 
     * @return the average value as a double
     */
    public double average(){
        double average = 0;
        average = (double)sum()/count();
        return average;
    }

    /**
     * This method find the maximum value of the number in myArray.
     * 
     * @return the value of the highest number
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
     * This method finds the index of the max value in myArray.
     * 
     * @return the index number of that value
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

    /**
     * This method finds the index of the last number in the array that matches the inputed value.
     * 
     * @param  key is the number that is being searched for
     * @return is the latest index of that number
     */
    public int findLast(int key){
        int last = -1;
        int i = myArray.length-1;
        boolean found = false;
        while(!found && i>=0){
            if (myArray[i] == key){
                found = true;
                last = i;
            }
            i--;
        }
        return last;
    }

    /**
     * This method creates an array of all the index numbers of a certain value that matches the inputed value.
     * 
     * @param key  is the inputed value being searched for
     * @return  is the array of all of the indexes for that number
     */
    public int[] findAll(int key){
        int occur = 0;
        for(int i=0; i<myArray.length; i++)
            if (myArray[i] == key){
                occur++;
            }
            
        int array[] = new int[occur];
        int index = 0;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i] == key){
            array[index]=i;
            index++;
            }
        }
        
        return array;
    }

    /**
     * This method is a getter for myArray.
     * 
     * @return is myArray
     */
    public int[] getArray(){
        return myArray;
    }

    /**
     * This method creates a copy of myArray.
     * 
     * @return  is the new copy of myArray
     */
    public int[] copyArray(){
        int copy[] = Arrays.copyOf(myArray, myArray.length);
        return copy; 
    }

    /**
     * prints an int array, nicely formatted
     * 
     * @param inArray int array to print
     */
    public void print(int[ ] inArray)
    {
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");
    }
    
    /**
     * This method takes the inputed array and sorts it into ascending order.
     * 
     * @param inArray int array to sort in ascending order
     */
    public void sortArray(int[] inArray)
    {
        for(int i=0; i<inArray.length-1; i++)
           for(int j=i+1; j<inArray.length; j++)
              if(inArray[j]<inArray[i]){
                int temp = inArray[j];
                inArray[j] = inArray[i];
                inArray[i] = temp;
                }
    }
    
    /**
     * Creates a new array that is the reversed version of the inputed array.
     * 
     * @param inArray int array to be copied and reversed
     */
    public int[] reverseArray(int[] inArray)
    {
        int[] newArray = new int[inArray.length];
        int index = 0;
        for(int i=inArray.length-1; i>=0; i--){
            newArray[index] = inArray[i];
            index++;
        }
        return newArray;
    }
    


    
}
