import java.util.Scanner;

public class MobilePhoneSetting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brandname, modelname, voulume, battery percaentage : ");
        String brand = sc.next();
        String model = sc.next();
        int volume = sc.nextInt();
        int batteryPercentage = sc.nextInt();

        MobilePhone mb = new MobilePhone();
        mb.SetBrand(brand);
        mb.setModel(model);
        mb.setVoulume(volume);
        mb.setPercentage(batteryPercentage);

        System.out.println("Brand Name : " + mb.getBrand());
        System.out.println("Model : " + mb.getModel());
        System.out.println("Volume  : " + mb.getVolume());
        System.out.println("Battery Percentage : " + mb.getBatterpercentage());

    }

}

class MobilePhone {
    private String brand;
    private String model;
    private int volume;
    private int batteryPercentage;

    public void SetBrand(String brand) {
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setVoulume(int volume) {
        if (volume > 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Enter a Valid Volume : ");
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setPercentage(int batteryPercentage) {
        if (batteryPercentage > 0 && batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        } else {
            System.out.println("Enter a Valid BatteryPercentage : ");
        }
    }

    public int getBatterpercentage() {
        return batteryPercentage;
    }
}