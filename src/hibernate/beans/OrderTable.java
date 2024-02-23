package hibernate.beans;

public class OrderTable 
{
    private long contactNo;
    private int tableNo;
    private String customerName;
    
    private String review;

    public OrderTable(){
        
    }
    public OrderTable( long cNo,int tableNo1, String cName, String reviw) {
        this.contactNo=cNo;
        this.tableNo=tableNo1;
        this.customerName=cName;
        
        this.review=reviw;
       }

   
    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
