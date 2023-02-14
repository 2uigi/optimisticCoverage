public class PasswordChecker {

    private PasswordChecker(){}

    private static boolean validate(String string){
        return (string.length()>8);
    }

    public static boolean isPasswordValid(String string){
        return PasswordChecker.validate(string);
    }
}
