package sprint1.Uppg1;

public class Car {
    private String regNumber;
    private String model;
    private String manufacturer;
    private CarOwner owner; //vad händer om det är tvärtom? alltså att ägaren har en bil, snarare än att bilen har en ägare?

    public Car(String regNumber, String model, String manufacturer, CarOwner owner) {
        this.regNumber = regNumber;
        this.model = model;
        this.manufacturer = manufacturer;
        this.owner = owner;
    }

    public String getRegNumber() {

        return regNumber;
    }

    public String getModel() {

        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CarOwner getOwner() {
        return owner;
    }

    public void changeOwners(CarOwner buyer) {
        getOwner().sellCar(getRegNumber());
        setOwner(buyer);
        getOwner().buyCar(getRegNumber());
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    public String ownershipToString() {
        return this.owner.getName() + " owns the car with registration number " + this.getRegNumber(); //är det detta Sigrun är ute efter? Hur gör jag i så fall med de personer som inte äger någon bil?
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", owner=" + owner +
                '}';
    }
}
