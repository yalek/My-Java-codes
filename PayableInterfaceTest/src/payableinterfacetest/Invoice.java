
package payableinterfacetest;

public class Invoice implements Payable {
private String partNumber;
private String partDescription;
private int partQuantity;
private double partPricePerItem;

public Invoice(String number, String description, int quantity, double price){
    partNumber = number;
    partDescription = description;
    partQuantity = quantity;
    partPricePerItem = price;
    
}
public void setPartNumber(String number){
    partNumber = number;
}
public String getPartNumber(){
return partNumber;
}
public void setPartDescription(String description){
partDescription = description;
}
public String getPartDescription(){
return partDescription;
}
public void setPartQuantity(int quantity){
if(quantity>=0.0)
    partQuantity = quantity;
else
    throw new IllegalArgumentException("Quantity must be greater than 0.0");
}
public int getPartQuantity(){
return partQuantity;
}
public void setPartPricePerItem(double price){
if(price >0)
    partPricePerItem = price;
else
    throw new IllegalArgumentException("Price must be greater than 0.0");
}
public double getPartPricePerItem(){
return partPricePerItem;}
@Override
public String toString(){
return String.format("%s \n%s %s (%s)\n%s %d\n%s %.2f",
        "Invoice","PartNumber",getPartNumber(),getPartDescription(),
        "Quantity",getPartQuantity(),"PricePerItem",getPartPricePerItem());
}
@Override
public double getPaymentAmount(){
return getPartQuantity()* getPartPricePerItem();
}
}

