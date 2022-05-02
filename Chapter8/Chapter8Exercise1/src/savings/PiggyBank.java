
public class PiggyBank {
    private double penny;
    private double nickel;
    private double dime;
    private double quarter;

    // PENNY
    public void addPenny() {
        penny += 1;
    }

    public double getPenny() {
        return penny;
    }

    // NICKEL
    public void addNickel() {
        nickel += 1;
    }

    public double getNickel() {
        return nickel;
    }

    // DIME

    public void addDime() {
        dime += 1;
    }

    public double getDime() {
        return dime;
    }

    // QUARTER

    public void addQuarter() {
        quarter += 1;
    }

    public double getQuarter() {
        return quarter;
    }

    public void emptyPiggy() {
        penny = penny - penny;
        nickel = 0;
        dime = 0;
        quarter = 0;

    }

    @Override
    public String toString() {
        return "\nPiggyBank:  penny = " + penny + "| nickel = " + nickel + " |dime = " + dime + "| quarter = "
                + quarter + "\n\n";

    }

}
