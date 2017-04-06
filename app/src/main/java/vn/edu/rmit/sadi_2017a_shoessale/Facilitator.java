package vn.edu.rmit.sadi_2017a_shoessale;


class Facilitator extends User {
    private String facilitatorID;

    Facilitator(String firstName, String lastName, String email, String password, boolean login_status) {
        super(firstName, lastName, email, password, login_status);
//        TODO: set facilitatorID
    }

    public void viewOrder() {
//        TODO: to implement
    }

    public boolean confirmOrder() {
//        TODO: to implement
        return true;
    }

    public void sendEmailConfirmation() {
//        TODO: to implement
    }

    public String getFacilitatorID() {
        return facilitatorID;
    }

}
