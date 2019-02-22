package com.ata.service;

import java.util.ArrayList;

import com.ata.Bean.ReservationBean;
import com.ata.Bean.RouteBean;
import com.ata.Bean.VehicleBean;

public interface Customer {
	ArrayList<VehicleBean> viewVehiclesByType(String vehicleType) ;
	 ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats) ;
	 ArrayList<RouteBean> viewAllRoutes() ;
	 String bookVehicle(ReservationBean reservationBean); 
	 boolean cancelBooking(String userID, String reservationID); 
	 ReservationBean viewBookingDetails(String reservationID) ;
	 ReservationBean printBookingDetails(String reservationID) ;
	 

}
