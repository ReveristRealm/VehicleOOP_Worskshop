import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DealershipFileManager {
    public static void main(String[] args){}
    public Dealership getDealerShip(){
       ArrayList<Dealership> allDealerships = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File("Database.csv"));
            while(reader.hasNext()){

                    String info = reader.nextLine();
                    String[] information = info.split(Pattern.quote("|"));
                    String name = information[0];
                    String address = information[1];
                    String number = information[2];
                    Dealership dealership = new Dealership(name,address,number);
                    allDealerships.add(dealership);
                    while(!(info.contains("*"))){
                        info = reader.nextLine();
                        if(info.contains("*")){
                            break;
                        }
                        String[] vehicle = info.split(Pattern.quote("|"));
                        int vin = Integer.parseInt(vehicle[0]);
                        int year = Integer.parseInt(vehicle[1]);
                        String make = vehicle[2];
                        String model = vehicle[3];
                        String vehicleType = vehicle[4];
                        String color = vehicle[5];
                        int odometer = Integer.parseInt(vehicle[6]);
                        double price = Double.parseDouble(vehicle[7]);
                        Vehicle car = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                        dealership.addVehicle(car);
                    }
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        return allDealerships.get(0);
    }
    public static void saveDealerShip(){

    }
}
