public class DifferentDataTypesArray {

    public static void main(String[] args){

        //declare and initialize array
        int[] arrayInt = new int[2];
        double[] arrayDouble = new double[2];
        char[] arrayChar = new char[2];
        boolean[] arrayBoolean = new boolean[2];
        String[] arrayString = new String[2];

        //print default value for each array

        for(int arrayInts: arrayInt){
            System.out.println(arrayInts);
        }

        for(double arrayDoubles: arrayDouble){
            System.out.println(arrayDoubles);
        }

        for(char arrayChars: arrayChar){
            System.out.println(arrayChars);
        }

        for(boolean arrayBooleans: arrayBoolean){
            System.out.println(arrayBooleans);
        }

        for(String arrayStrings: arrayString){
            System.out.println(arrayStrings);
        }
    }
    
}
