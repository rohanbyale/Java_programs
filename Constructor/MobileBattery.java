public class MobileBattery {
    
}

class Mobile{
    public String brand;
    public int price;
    public int batteryPercentage;

    public Mobile(String brand, int price , int batteryPercentage){
        this.brand = brand;
        this.price = price;
        this.batteryPercentage = batteryPercentage;

    }

    public int chargeBattery(int amount){
        batteryPercentage = batteryPercentage + amount;
        return batteryPercentage;
    }

    public int useMobile(int amount){
batteryPercentage = batteryPercentage - amount;
return batteryPercentage;

    }

    public void dislayDetails(){
        
    }
}