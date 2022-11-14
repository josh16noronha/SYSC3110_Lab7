public class LifelineSite extends Site{

    private double _units;
    private double _rate;
    private double base;
    private double tax;

    public double getBaseAmount(){
        base = _units * _rate * 0.5;
        return base;

    }
    public double getTaxAmount(){
        tax = base * Site.TAX_RATE * 0.2;
        return tax;

    }


}
