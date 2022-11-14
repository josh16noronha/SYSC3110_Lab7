public abstract class Site {

    protected double _units=1;
    protected double _rate=1;
    final static double TAX_RATE=1;

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    protected abstract double getBaseAmount();

    protected abstract double getTaxAmount();




public static void main(String args[]){
    LifelineSite life = new LifelineSite();
    System.out.println(life.getBillableAmount());


    ResidentialSite res = new ResidentialSite();
    System.out.println(res.getBillableAmount());


}


}