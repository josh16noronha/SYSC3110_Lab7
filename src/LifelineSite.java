public class LifelineSite extends Site {



    public double getBaseAmount(){
        return _units * _rate * 0.5;

    }
    public double getTaxAmount(){
        return getBaseAmount()* Site.TAX_RATE * 0.2;

    }


}
