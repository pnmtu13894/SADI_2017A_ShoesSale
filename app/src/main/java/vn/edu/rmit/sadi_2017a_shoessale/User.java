package vn.edu.rmit.sadi_2017a_shoessale;

/**
 * Created by duale on 5/4/2017.
 */

abstract class User {
    //    TODO: Tú implement userID as String
    private String userID;
    private String firstName;
    private String lastName;
    private String email;
    //    TODO: encrypt password http://stackoverflow.com/questions/12937641/handling-passwords-used-for-auth-in-source-code
    private String password;
    //    TODO: ask Tu if I can change login status to boolean
    private boolean login_status;

    public void verifyLogin() {
//        TODO: to implement
    }

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogin_status() {
        return login_status;
    }

    public void setLogin_status(boolean login_status) {
        this.login_status = login_status;
    }
}
