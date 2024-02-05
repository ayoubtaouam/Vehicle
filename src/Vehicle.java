class Vehicle{
    private String make;
    private String model;
    private int rentalPrice;
    private boolean rented;
    Vehicle(String make, String model, int rentalPrice, boolean rented){
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rented = rented;
    }

    public String getMake() {
        return make;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    public  void setRented(boolean rented){
        this.rented = rented;
    }

    public boolean isRented() {
        return rented;
    }

    public void displayInfo(){
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price: " + getRentalPrice());
    }
}