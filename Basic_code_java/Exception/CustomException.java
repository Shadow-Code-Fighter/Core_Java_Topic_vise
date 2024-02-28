package Exception;


//User create custom exception where inherit parent message using super keyword
class UserCustomException extends Exception {
    public UserCustomException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) throws UserCustomException {
        throw new UserCustomException("This is my Custom Exception");
    }
}
