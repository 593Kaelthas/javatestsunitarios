package javatests.util;



public class PasswordUtil {
    public enum SecurityLevel{
        WEAK,MEDIUM,STRONG;
    }
    //este metodo me indica si el password es debil, medio o fuerte
    public static SecurityLevel assesPassword(String password){
        if (password.length()<8)
            return SecurityLevel.WEAK;
        if (password.matches("[A-Za-z]+"))
            return SecurityLevel.WEAK;
        if (password.matches("[A-Za-z0-9]+"))
            return SecurityLevel.MEDIUM;
        return SecurityLevel.STRONG;
    }
}
