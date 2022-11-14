public class Site {
    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
}
