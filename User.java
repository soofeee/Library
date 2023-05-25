
package Library;

public class User {
    private String userName;
    private int phoneNumber;
    private String password;
    
    public User(String name,int number,String pass){
        userName=name;
        phoneNumber=number;
        password=pass;
    }

    public String getUserName() {
        return userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

   

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

  

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
