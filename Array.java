public class Array {

    public static void main (String[] args){

    
        int[] numbers = new int [4];
        
        try{

            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;
            numbers[3] = 40;
            numbers[4] = 50;
            

            for(int i=0; i<numbers.length; i++){
                System.out.println(numbers[i]);
            }
    
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad" + e.getMessage());
        }
        
    }
    
}
