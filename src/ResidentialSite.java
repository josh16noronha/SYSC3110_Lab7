public class ResidentialSite extends Site{
    private double _units;
    private double _rate;
    private double base;
    private double tax;

    public double getBaseAmount(){
        base = _units * _rate ;
        return base;

    }
    public double getTaxAmount(){
        tax = base * Site.TAX_RATE ;
        return tax;

    }
}
