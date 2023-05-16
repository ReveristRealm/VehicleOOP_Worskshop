import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;
    private int counter = 0;
    private int pos;

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                ", number=" + pos +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }

    public Dealership(String name, String address, String phone){
        counter++;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
        this.pos = counter;

    }
    public ArrayList<Vehicle> getVehicleByPrice(double min , double max){
        ArrayList<Vehicle> showthis = new ArrayList<>();
        for(Vehicle car : inventory){
            if(car.getPrice() > min && car.getPrice() < max ){
                showthis.add(car);
            }
        }
       return showthis;
    }
    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        ArrayList<Vehicle> showthis = new ArrayList<>();
        for(Vehicle car : inventory){
            if(car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)){
                showthis.add(car);
            }
        }
        return showthis;
    }
    public ArrayList<Vehicle> getVehicleByYear(double min, double max){
        ArrayList<Vehicle> showthis = new ArrayList<>();
        for(Vehicle car : inventory){
            if(car.getYear() > min && car.getYear() < max){
                showthis.add(car);
            }
        }
        return showthis;
    }
    public ArrayList<Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> showthis = new ArrayList<>();
        for(Vehicle car : inventory){
            if(car.getColor().equalsIgnoreCase(color)){
                showthis.add(car);
            }
        }
        return showthis;
    }
    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){
        ArrayList<Vehicle> showthis = new ArrayList<>();
        for(Vehicle car : inventory){
            if(car.getOdometer() > min && car.getOdometer() < max){
                showthis.add(car);
            }
        }
        return showthis;
    }
    public ArrayList<Vehicle> getVehicleByType(String vehicleType){
        ArrayList<Vehicle> showthis = new ArrayList<>();
        for(Vehicle car : inventory){
            if(car.getVehicleType().equalsIgnoreCase(vehicleType)){
                showthis.add(car);
            }
        }
        return showthis;
    }
    public ArrayList<Vehicle> getAllVehicle(){
        ArrayList<Vehicle> showthis = new ArrayList<>(inventory);
        return showthis;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(int vin){
        for(int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getVin() == vin){
               inventory.remove(inventory.get(i));
            }
        }
    }

}
