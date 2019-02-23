package com.ata.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ata.bean.VehicleBean;


public class VehicleDaoImpl implements XyzDao<VehicleBean> {
	@Autowired
	SessionFactory ses;
	
	@Override
	public String create(VehicleBean vehicleBean) {
	String vehicleid=	(String)ses.getCurrentSession().save(vehicleBean);
		return vehicleid;
	}

	@Override
	public int delete(ArrayList<String> li) {
		Session s=ses.getCurrentSession();
		String sql="delete form VehicleBean v where v.vehicleid IN (:list)";
		Query q=s.createQuery(sql);
		q.setParameterList("list", li);
		int rows=q.executeUpdate();
		return rows;
	}

	@Override
	public boolean update(VehicleBean t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public VehicleBean findbyID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<VehicleBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
