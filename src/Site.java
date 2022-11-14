public class Site {

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
    
    public double getBaseAmount(){
        return getBaseAmount();
    }

    protected double getTaxAmount(){
        return getTaxAmount();
    }

}
