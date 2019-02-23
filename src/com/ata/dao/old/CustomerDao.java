package com.ata.dao.old;

import java.util.ArrayList;

import com.ata.bean.ReservationBean;
import com.ata.bean.RouteBean;
import com.ata.bean.VehicleBean;

public interface CustomerDao {
	ArrayList<VehicleBean> viewVehiclesByType(String vehicleType) ;
	 ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats) ;
	 ArrayList<RouteBean> findAllRoutes() ;
	 String bookVehicle(ReservationBean reservationBean); 
	 boolean cancelBooking(String userID, String reservationID); 
	 ReservationBean viewBookingDetails(String reservationID) ;
	 ReservationBean printBookingDetails(String reservationID) ;
	 

}
