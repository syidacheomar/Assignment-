public class multiDimensional {

    public static void main(String[] args){

        int [][] matrix = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8,9}
        };

        //print length of array
        System.out.println("The length of main array is: " + matrix.length) ;

        //print the lengths of sub-arrays
        for(int i = 0; i<matrix.length; i++){
            System.out.println("The length of sub array" + " " + i + " " + "is:" + " " + matrix[i].length);
        }

        //print each element of the array in a formatted manner
        for(int row=0; row<matrix.length; row++)
            for(int col=0; col<matrix.length; col++){
                System.out.println(matrix[row][col]);
            }

                
    


        
    }
    
}
