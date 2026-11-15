package Collection;

import java.util.*;
public class HospitalManagement {
	public static void main(String[]args) {
		
		Hospital apollo = new Hospital();
		apollo.addEquipment(new MedicalEquipment(101,"ECG Machine"));
		apollo.addEquipment(new MedicalEquipment(102,"Wheel Chair "));
		apollo.addEquipment(new MedicalEquipment(103,"Oxygen conentrator"));
		
		apollo.issueEquipment(102);
		apollo.issueEquipment(102);
		apollo.returnEquipment(102);
		apollo.diplayAllEquipment();
		
	}

}

class MedicalEquipment{
	public int id;
	public String equipmentName;
	public boolean available = true;
	
	public MedicalEquipment(int id, String equipmentName) {
		
		this.id = id;
		this.equipmentName = equipmentName;
		
	}
	
	public boolean issueEquipment() {
		if(available) {
			available  = false;
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public void returnEquipment() {
		if(available == false) {
			available = true;
		}
		
	}
	
	public void displayEquipment() {
		System.out.println("Id : "+id);
		System.out.println("Equipment Name : "+equipmentName);
		System.out.println("Availability : "+available);
		
	}
	
}

class Hospital{
	
	Vector<MedicalEquipment> v = new Vector<>();
	
	public void addEquipment(MedicalEquipment eqipment) {
		v.add(eqipment);
		System.out.println(eqipment.equipmentName +" is added ");
		System.out.println();
		
	}
	
	
	public void issueEquipment(int id) {
		
		boolean isEquipmetFound = false;
		
		for(MedicalEquipment e : v) {
			if(e.id == id) {
				if(e.available) {
					
					e.issueEquipment();
					System.out.println("Equpment is issued Successfully");
				} else {
					System.out.println("Equipment is currently unaviable");
				}
				
				isEquipmetFound = true;
			}
			
		}
		
		if(isEquipmetFound == false) {
			System.out.println("Equipemnt is Not Found : ");
		}
		
	}
	
	public void returnEquipment(int id) {
boolean isEquipmetFound = false;
		
		for(MedicalEquipment e : v) {
			if(e.id == id) {
				if(e.available == false ) {
					
					e.returnEquipment();
					System.out.println("Equpment returned  Successfully");
					System.out.println();
				} else {
					System.out.println("Equipment is already  aviable");
				}
				
				isEquipmetFound = true;
			}
			
		}
		
		if(isEquipmetFound == false) {
			System.out.println("Equipemnt is Not Found : ");
		}
		
	}
	public void diplayAllEquipment() {
		         for(MedicalEquipment e : v) {
		        	 e.displayEquipment();
		        	 System.out.println();
		         }
	}
}
