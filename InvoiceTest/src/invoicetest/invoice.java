
package invoicetest;

public class invoice {
    private String pnumber;
    private String pdescription;
    private int quantity;
    private double price;
    
    public invoice(String number, String description, int qua, double p){
        pnumber = number;
        pdescription = description;
        quantity = qua;
        price=p;
    }
    
    public void setNumber(String number){ pnumber = number;}
    public String getNumber(){return pnumber;}
    
    public void setDescription(String description){pdescription = description;}
    public String getDes(){ return pdescription;}
    
    public void setQua(int qua){quantity = qua;}
    public int getQua(){return quantity;}
    
    public void setP(double p){price = p;}
    public double getP(){return price;}
    
    public void getInvoiceAmount(){
        if (quantity <=0)quantity = 0;
        if (price <=0) price =0;
        double amount = quantity*price; 
        System.out.println(getNumber());
        System.out.println(getDes());
        System.out.println(amount);}
     
    
}
