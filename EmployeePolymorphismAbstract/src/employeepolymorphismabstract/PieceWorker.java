
package employeepolymorphismabstract;

public class PieceWorker extends Employee {
private double wage;
private int piece;
    
    public PieceWorker(String first,String last, String ssn, double wages,int pieces){
    
        super(first, last, ssn);
        setWages(wages);
        setPieces(pieces);
    }
    public void setWages(double wages){
        if(wages>=0.0)
            wage=wages;
        else
            throw new IllegalArgumentException("Wages has to be more that 0.0");
    }
    public double getWages(){return wage;}
    
    public void setPieces(int pieces){
    if(pieces>=0)
        piece=pieces;
    else
            throw new IllegalArgumentException("Piece has to be more that 0");
    }
    public int getPieces(){return piece;}
    
    @Override
    public double earning(){
    
        return getWages()*getPieces();
    }
    @Override
    public String toString(){
    return String.format("%s \n%s %.2f\n%s %d\n", super.toString(),"Wage", getWages(),"Pieces",getPieces());
    }
    
}
