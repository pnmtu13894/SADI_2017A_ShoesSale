package vn.edu.rmit.sadi_2017a_shoessale;


class Payment {
    private static int nextID = 0;
    private int id;
    private int orderID;

    Payment(int orderID) {
        this.orderID = orderID;
        this.id = nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public void callPaymentProcess() {
//        TODO: to implement
    }

    public int getId() {
        return id;
    }

    public int getOrderID() {
        return orderID;
    }


}
