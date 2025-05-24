public class LongTermContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public LongTermContract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public LongTermContract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public LongTermContract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public LongTermContract buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public LongTermContract signContract() {
        System.out.println("Long-term contract " + contractID + " signed.");
        return this;
    }

    @Override
    public String toString() {
        return "LongTermContract [contractID=" + contractID + ", propertyID=" + propertyID + ", tenantID=" + tenantID
                + ", rentAmount=" + rentAmount + "]";
    }

    
}
