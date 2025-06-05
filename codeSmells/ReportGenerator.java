import java.util.List;
import java.util.ArrayList;

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Property {
    private String name;
    private double rentAmount;
    private Owner owner; 
    private String location;

    public Property(String name, double rentAmount, Owner owner, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

     public String getOwnerName() {
        return owner.getName();
    }

    public String getLocation() {
        return location;
    }

    public boolean isPremium() {
        return rentAmount > 2000;
    }

    public double getYearlyRent() {
        return rentAmount * 12;
    }

    public String getPropertyDetails() {
        String propertyDetails = new String();
        propertyDetails += "Property: " + name + "\n" +
                "Rent Amount: $" + rentAmount + "\n" +
                "Owner: " + getOwnerName() + "\n" +
                "Location: " + location;
        return propertyDetails;

    }
}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
        for (Property property : properties) {
            System.out.println(property.getPropertyDetails());
            totalRent += property.getRentAmount();
            System.out.println("Type: " + (property.isPremium() ? "Premium" : "Standard"));
            System.out.println("Yearly Rent: $" + property.getYearlyRent());
            System.out.println("--------------------");
        }
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        Owner John_Doe = new Owner("John Doe");
        Owner Jane_Smith= new Owner("Jane Smith");
        Owner Bob_Johnson= new Owner("Bob Johnson");
        Property property1 = new Property("Apartment A", 1500.0, John_Doe, "City Center");
        Property property2 = new Property("House B", 2000.0, Jane_Smith, "Suburb");
        Property property3 = new Property("Condo C", 1800.0, Bob_Johnson, "Downtown");
        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary",
                List.of(property1, property2, property3));
        financialReport.generateReport();
    }
}