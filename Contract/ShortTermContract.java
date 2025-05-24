public class ShortTermContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public ShortTermContract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public ShortTermContract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public ShortTermContract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public ShortTermContract buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public ShortTermContract signContract() {
        System.out.println("Short-term contract " + contractID + " signed.");
        return this;
    }

    @Override
    public String toString() {
        return "ShortTermContract [contractID=" + contractID + ", propertyID=" + propertyID + ", tenantID=" + tenantID
                + ", rentAmount=" + rentAmount + "]";
    }

    
}
