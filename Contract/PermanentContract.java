public class PermanentContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public PermanentContract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public PermanentContract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public PermanentContract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public PermanentContract buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public PermanentContract signContract() {
        System.out.println("Permanent contract " + contractID + " signed.");
        return this;
    }

    @Override
    public String toString() {
        return "PermanentContract [contractID=" + contractID + ", propertyID=" + propertyID + ", tenantID=" + tenantID
                + ", rentAmount=" + rentAmount + "]";
    }

   
}
