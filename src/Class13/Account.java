package Class13;

public class Account {
    String AccountId;
    String userName;
    String password;
    double balace;
    String typeOfAccount;
    double limit;
    boolean isBlocked;

    boolean login(String myuserName,String mypassword) {
        if (userName.equals(myuserName) && password.equals(mypassword)) {
            return true;
        }else{
            return false;

        }
    }
}
