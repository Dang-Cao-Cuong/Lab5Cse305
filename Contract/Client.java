public class Client {

    public Contract requestCreateRentalContract(Contract builder, String contractID, String propertyID, String tenantID, double rentAmount) {
        return builder.buildContractID(contractID)
                      .buildPropertyID(propertyID)
                      .buildTenantID(tenantID)
                      .buildRentAmount(rentAmount)
                      .signContract();
    }


    
    public static void main(String[] args) {
        Client client = new Client();

     
        LongTermContract builderL = new LongTermContract();
        Contract signedContractL = client.requestCreateRentalContract(builderL, "L001", "P101", "T201", 1200.0);
        System.out.println(signedContractL);

        PermanentContract builderP = new PermanentContract();
        Contract signedContractP = client.requestCreateRentalContract(builderP, "P001", "P102", "T202", 1800.0);
        System.out.println(signedContractP);

        ShortTermContract builderS = new ShortTermContract();
        Contract signedContractS = client.requestCreateRentalContract(builderS, "S001", "P103", "T203", 900.0);
        System.out.println(signedContractS);
        



        
       
       
    }
}
