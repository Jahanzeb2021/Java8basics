package Class13;

public class BankApplication {
    public static void main(String[] args) {
           Account burjusAccount=new Account();
           burjusAccount.AccountId="123";
           burjusAccount.userName="Burjus";
           burjusAccount.password="pass123";
           burjusAccount.balace=1000000;
           burjusAccount.typeOfAccount="cheking";
           burjusAccount.limit=125;

           boolean isLoggedIn=burjusAccount.login("abc123","abcere");
        System.out.println(isLoggedIn);

        Account IlyasAccount=new Account();
        IlyasAccount.AccountId="125";
        IlyasAccount.userName="Ilyas";
        IlyasAccount.password="pass123";
        IlyasAccount.balace=15000;
        IlyasAccount.typeOfAccount="Saving";
        IlyasAccount.limit=100;



    }
}
