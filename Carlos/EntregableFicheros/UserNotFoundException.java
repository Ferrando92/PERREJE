public class UserNotFoundException extends Exception
{
    public UserNotFoundException(){
        super();
    }
    
    public UserNotFoundException(String mensaje){
        super(mensaje);
    }
       
    public UserNotFoundException(String mensaje, Throwable t){
        super(mensaje,t);
    }
}
