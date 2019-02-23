package com.ata.dao;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ata.bean.DriverBean;
import com.ata.bean.ReservationBean;
import com.ata.bean.RouteBean;
import com.ata.bean.VehicleBean;

@Repository
public class AdminDaoImpl implements AdminDao{
	

	@Autowired
	SessionFactory sf;
	
	@Transactional
	@Override
	public String createVehicle(VehicleBean vehicleBean) {
		
		sf.getCurrentSession().save(vehicleBean);
		
		return "";
	}

	@Override
	public int deleteVehicle(ArrayList<String> vehicleID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public VehicleBean findByID(String vehicleID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateVehicle(VehicleBean vehicleBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createDriver(DriverBean driverBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteDriver(ArrayList<String> driverID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean allotDriver(String reservationID, String driverID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyDriver(DriverBean driverBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createRoute(RouteBean routeBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteRoute(ArrayList<String> routeID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RouteBean findbyID(String routeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyRoute(RouteBean routeBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ReservationBean> viewBookingDetails(Date journeyDate,
			String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
