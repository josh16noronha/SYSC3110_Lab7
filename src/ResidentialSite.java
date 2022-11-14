public class ResidentialSite extends Site {


    public double getBaseAmount(){
        return _units * _rate;

    }
    public double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE ;

    }
}
