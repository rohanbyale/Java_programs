package Collection;

import java.util.Vector;

public class CinemaTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Seat{
	public int seatNumber;
	public boolean booked  = false  ;
	
	
	public Seat(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public boolean bookSeat() {
		if(booked == false ) {
		booked = true;
		return true;
		}
		else {
			return false;
		}
	}
	
	public boolean cancleBooking() {
		if(booked == true ) {
			booked = false;
			return true;
			}
			else {
				return false;
			}
		}
	
	public void displaySeat() {
		System.out.println("Available of Seat : "+booked);
	}
		
		
	}

class Theatre{
	
	Vector<Seat> seats = new Vector<>();
	
 public void addSeat(Seat s) {
	 
	 for(int i = 1; i<=10; i++) {
		 seats.add(new Seat(i));
	 }
 }
 
 public void bookSeat(int seatNumber) {
	boolean isFound = false;
	
	for(Seat e : seats) {
		
		if(e.seatNumber == seatNumber) {
			isFound = true;
			e.bookSeat();
			System.out.println("Seat is booked");
		}else if(e.seatNumber == seatNumber){
		    isFound = true;
		    e.bookSeat();
		    System.out.println("Seat is already booked");
		}
	}
	
	if(isFound == false) {
		System.out.println("Invalid Seat Number");
	}
 }
 
 public void cancleBooking(int seatNumber) {
	 for(Seat e : seats) {
			
			if(e.bookSeat() == true) {
			
				e.booked = false;
			}else {
				
			}
		}
		
 }
 
}
