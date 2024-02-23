package hibernate.beans;

public class Order 
{
    private long contactNo;
    private String customerName;
    private int tableNo;
    private String dishName;
    private String price;
    private String review;
    
    public Order(){
    }

    public Order(long contactNo, String customerName, int tableNo, String dishName, String price, String review) {
        this.contactNo = contactNo;
        this.customerName = customerName;
        this.tableNo = tableNo;
        this.dishName = dishName;
        this.price = price;
        this.review = review;
    }

    
    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
    
}