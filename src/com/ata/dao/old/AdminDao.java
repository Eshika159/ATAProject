package com.ata.dao.old;

import java.util.ArrayList;
import java.util.Date;

import com.ata.bean.DriverBean;
import com.ata.bean.ReservationBean;
import com.ata.bean.RouteBean;
import com.ata.bean.VehicleBean;

public interface AdminDao {
	
	String createVehicle(VehicleBean vehicleBean);
	int deleteVehicle(ArrayList<String>vehicleID);
	VehicleBean findByID(String vehicleID);
	boolean updateVehicle(VehicleBean vehicleBean);
	String createDriver(DriverBean driverBean );
	int deleteDriver(ArrayList<String> driverID);
	boolean allotDriver(String reservationID,String driverID);
	boolean modifyDriver(DriverBean driverBean);
	String createRoute(RouteBean routeBean);
	int deleteRoute(ArrayList<String>routeID);
	RouteBean findbyID(String routeID);
	boolean modifyRoute(RouteBean routeBean);
	ArrayList<ReservationBean> viewBookingDetails(Date journeyDate,String source, String destination); 


}
