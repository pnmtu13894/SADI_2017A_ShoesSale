package vn.edu.rmit.sadi_2017a_shoessale;


class itemLine {
    private int cartID;
    private int productID;
    private int quantity;

    itemLine(int cartID, int productID, int quantity) {
        this.cartID = cartID;
        this.productID = productID;
        this.quantity = quantity;
    }

    //    TODO: nói Tú không thể để unitPrice là attribute của itemLine được vì giá trị này sẽ được get từ productID // Hien tai thi minh
    // chua co attribute unitPrice ben product, nen em tam. thoi` de ben day a.
//    private float unitprice
    public double calcPrice() {
//        TODO: to implement
        return 0.0;
    }

    public int getCartID() {
        return cartID;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
