package Vector;

import java.util.Vector;

public class ParkingSlotManagment {

}

class ParkingSlot {
	int slotNumber;
	String vechicleNumber = "";
	boolean occupied = false;

	public ParkingSlot(int slotnumber) {
		this.slotNumber = slotnumber;
	}

	public boolean parkVehicle(String vechicleNumber) {
		if (occupied == false) {
			this.vechicleNumber = vechicleNumber;
			occupied = true;
			return true;
		} else {
			return false;
		}
	}

	public void removeVehicle() {
		if (occupied == true) {
			vechicleNumber = "";
			occupied = false;
		}
	}

	public void displaySlot() {
		System.out.println("Slot Number : " + slotNumber);
		System.out.println("Occupied Status : " + occupied);
		if (occupied == true)
			System.out.println("Vehicle Number : " + vechicleNumber);
	}

}

class ParkingLot {
	Vector<ParkingSlot> slots = new Vector<ParkingSlot>();

	public ParkingLot() {
		for (int i = 1; i <= 5; i++) {
			slots.add(new ParkingSlot(i));
		}
	}
	
	public void parkVehicle(int slotnumber, String vehicleNumber) {
		for(ParkingSlot e : slots) {
			if(e.equals(slotnumber)) {
				
			}
		}
		
	}

}