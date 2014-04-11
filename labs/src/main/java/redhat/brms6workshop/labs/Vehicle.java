package redhat.brms6workshop.labs;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(98721483653e3157877981dab663741b)
 */
@org.kie.api.definition.type.Label(value = "Vehicle")
public class Vehicle extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Vehicle Make")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String make;
    
    @org.kie.api.definition.type.Label(value = "Vehicle Model")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String model;
    
    @org.kie.api.definition.type.Label(value = "VIN")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String vin;
    
    @org.kie.api.definition.type.Label(value = "Vehicle Year")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer year;

    public Vehicle() {
    }

    public Vehicle(java.lang.String vin, java.lang.String model, java.lang.Integer year, java.lang.String make) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.make = make;
    }


    
    public java.lang.String getMake() {
        return this.make;
    }

    public void setMake(java.lang.String make) {
        this.make = make;
    }
    
    public java.lang.String getModel() {
        return this.model;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }
    
    public java.lang.String getVin() {
        return this.vin;
    }

    public void setVin(java.lang.String vin) {
        this.vin = vin;
    }
    
    public java.lang.Integer getYear() {
        return this.year;
    }

    public void setYear(java.lang.Integer year) {
        this.year = year;
    }
}