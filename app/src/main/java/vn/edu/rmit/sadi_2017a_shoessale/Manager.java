package vn.edu.rmit.sadi_2017a_shoessale;



class Manager extends User {
    private String managerID;

    Manager(String firstName, String lastName, String email, String password, boolean login_status) {
        super(firstName, lastName, email, password, login_status);
//        TODO: set managerID
    }

    public void createProduct() {
//        TODO: to implement
    }

    public void deleteProduct() {
//        TODO: to implement
    }

    public void updateProduct() {
//        TODO: to implement
    }

    public void viewProduct() {
//        TODO: to implement
    }

    public void createCategory() {
//        TODO: to implement
    }

    public String getManagerID() {
        return managerID;
    }
}
