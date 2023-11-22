
package hengerprogram;

public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
    }
    
    public TomorHenger(double sugar, double fajsuly, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    
    public double suly(){
        return 0;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }

}
