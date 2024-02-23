   package hibernate.beans;

public class AdminLogin 
{
    private String loginId;
    private String password;

    public AdminLogin() {
        
    }

    public AdminLogin(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }


    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//  private String login;
//  private String passwod;
//
//public AdminLogin(){
//}
//
//    public AdminLogin(String login, String passwod) {
//        this.login = login;
//        this.passwod = passwod;
//    }
//
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPasswod() {
//        return passwod;
//    }
//
//    public void setPasswod(String passwod) {
//        this.passwod = passwod;
//    }
   
}
