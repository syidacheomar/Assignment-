public class Boolean {
    
    public static void main(String[] args){

        boolean isLoggedIn = true;
        boolean hasPermission = false;

        if(!isLoggedIn){
            System.out.println("The user is not logged in");
        }else if(!hasPermission){
            System.out.println("User does not have the necessary permissions");
        }
    }
}
