
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    static Scanner userInput =  new Scanner(System.in);
private Dealership dealership;
    public UserInterface() {
}
    public void display(){
        inIt();
        while(true){
            System.out.println("----------------------------------");
            System.out.println("Which option would you like to do?");
            System.out.println("1] Get Vehicle by Price Range");
            System.out.println("2] Get Vehicle by Make/Model");
            System.out.println("3] Get Vehicle by Year Range");
            System.out.println("4] Get Vehicle by Color");
            System.out.println("5] Get Vehicle by mileage range");
            System.out.println("6] Get Vehicle by vehicle type");
            System.out.println("7] Get All Vehicles");
            System.out.println("8] Add a vehicle");
            System.out.println("9] Remove a vehicle");

            int pickthis = userInput.nextInt();
            switch (pickthis){
                case 1:
                    System.out.println("Enter your min:");
                    double min = userInput.nextInt();
                    System.out.println("Enter your max:");
                    double max = userInput.nextInt();
                    processGetByPriceRequest(min, max);
                    break;
                case 2:
                    System.out.println("What is the make?");
                    String make = userInput.next();
                    System.out.println("What is the model?");
                    String model = userInput.next();
                    processGetByMakeModelRequest(make,model);
                    break;
                case 3:
                    System.out.println("What is the starting year");
                    int sYear = userInput.nextInt();
                    System.out.println("What is the ending year");
                    int eYear = userInput.nextInt();
                    processGetByYearRequest(sYear,eYear);
                    break;
                case 4:
                    System.out.println("What is the color you want?");
                    String color = userInput.next();
                    processGetByColorRequest(color);
                    break;
                case 5:
                    System.out.println("What is the starting mile?");
                    int sMile = userInput.nextInt();
                    System.out.println("What is the ending mile?");
                    int eMile = userInput.nextInt();
                    processGetByMileageRequest(sMile, eMile);
                    break;
                case 6:
                    System.out.println("What vehicle type are you looking for?");
                    String type = userInput.next();
                    processGetByVehicleTypeRequest(type);
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
            }
        }
    }
    private void inIt(){
        System.out.println("What dealership would you like to go to");
        System.out.println("1)Los Santos Customs");
        System.out.println("2)D&V Car Fantasy");
        int choice = userInput.nextInt();
        DealershipFileManager file = new DealershipFileManager();
        this.dealership = file.getDealerShip(choice);
    }

    public void processGetByPriceRequest (double min, double max) {

    }
    public void processGetByMakeModelRequest (String make,String model) {

    }
    public void processGetByYearRequest (int sYear, int eYear) {

    }
    public void processGetByColorRequest (String color) {

    }
    public void processGetByMileageRequest (int min , int max) {

    }
    public void processGetByVehicleTypeRequest (String type) {

    }
    public void processGetAllVehiclesRequest () {
        displayVehicles(dealership.getAllVehicle());
    }
    public void processAddVehicleRequest () {

    }
    public void processRemoveVehicleRequest () {

    }
    private void displayVehicles(ArrayList<Vehicle> inventory){
        for(Vehicle cars: inventory){
            System.out.println(cars);
        }
    }
}
