# First-Java-project
random java classes

public class User {
    private String name;

    public String getPassword() {
        return password;
    }

    private String password;

    public User()
    {
        name = "Guest";
        password = encrypt("123");
    }
    public User(String name, String password)
    {
        this.name = name;
        this.password = encrypt(password);
    }

    public String encrypt(String password)
    {
        String encryptedPassword = new String();
        for (int i = 0; i < password.length(); i++) {
            encryptedPassword = encryptedPassword + (char)((int)password.charAt(i)*17);
        }
        return encryptedPassword;
    }
    private String decipher(String password)
    {
        String decipheredPassword = new String();
        for (int i = 0; i < password.length(); i++) {
            decipheredPassword = decipheredPassword + (char)((int)password.charAt(i)/17);
        }
        return decipheredPassword;
    }
}
