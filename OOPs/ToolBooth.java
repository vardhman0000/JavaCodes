package OOPs;

public class ToolBooth {

    static class Toll {
        int totalVehicles;
        double totalAmountCollected;

        Toll(){
            totalVehicles = 0;
            totalAmountCollected = 0;
        }

        void recordVehicle(double tollAmount){
            totalVehicles++;
            totalAmountCollected += tollAmount;
        }

        void getTotalVehicles(){
            System.out.println("Total Vehicles : " + totalVehicles);
        }

        void getTotalAmountCollected(){
            System.out.println("Total Amount Collected : " + totalAmountCollected);
        }

        void displayData(){
            getTotalVehicles();
            getTotalAmountCollected();
        }

    }

    public static void main(String[] args) {
        Toll booth1 = new Toll();
        booth1.recordVehicle(200);
        booth1.recordVehicle(300);
        booth1.recordVehicle(400);

        booth1.displayData();
    }

}
