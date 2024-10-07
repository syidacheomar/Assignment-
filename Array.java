public class Array {

    public static void main (String[] args){

    
        int[] numbers = {10,20,30,40,50};
        
        System.out.println("Element of the array:");
        for(int i=0; i<numbers.length; i++){
            System.out.println("Element at index " + "" + i + ":" + numbers[i]);
        }
        
        try{ 
            System.out.println("Accessing out of bound:" + numbers[6]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());
        }
        
    }
    
}
