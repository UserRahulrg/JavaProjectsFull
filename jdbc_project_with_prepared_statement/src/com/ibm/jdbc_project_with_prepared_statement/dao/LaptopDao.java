package com.ibm.jdbc_project_with_prepared_statement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ibm.jdbc_project_with_prepared_statement.connection.LaptopConnection;
import com.ibm.jdbc_project_with_prepared_statement.dto.Laptop;

public class LaptopDao {

	Connection connection = LaptopConnection.getLaptopConnection();
	
	final String INSERT_LAPTOP_QUERY = "INSERT INTO laptop(id,name,price,color,mfd) values(?,?,?,?,?)";
	final String DELETE_LAPTOP_QUERY = "DELETE from laptop where id=?";
	final String UPDATE_LAPTOP_QUERY = "update laptop set name=?, where id=?";
	final String DISPLAY_ALL_LAPTOP_QUERY = "SELECT * FROM laptop";
	final String DISPLAY_SINGLE_LAPTOP_QUERY = "SELECT * FROM laptop where id=?";
	/* Query self implementation */
	final String DISPLAY_BY_NAME_QUERY="";
	
	public Laptop saveLaptopDao(Laptop laptop) {
		try {
			PreparedStatement ps = connection.prepareStatement(INSERT_LAPTOP_QUERY);
			ps.setInt(1, laptop.getId());
			ps.setString(2, laptop.getName());
			ps.setString(3, laptop.getColor()); 
			ps.setDouble(4, laptop.getPrice()); 
			ps.setObject(5, laptop.getMfd());
			ps.execute();
			return Laptop;
		}
		catch{
			e.printStackTrace();
			return null;
		}
//		finally {
//			
//		}
		
		public List<Laptop> displayAllLaptop(){
			

			
			try {
				ResultSet set = ps.executeQuery();
				List<Laptop> laptops = new ArrayList<Laptop>();
				PreparedStatement ps = connection.prepareStatement(DISPLAY_ALL_LAPTOP_QUERY);
				ResultSet set = ps.executeQuery();
				
				while(set.next()) {
					
					int id = set.getInt("id");
					String name = set.getString("name");
					String color = set.getString("color");
					double price = set.getDouble("price");
					LocalDate mfd = set.getDate("mfd").toLocalDate();				}
					
					Laptop laptop = new Laptop(id,name,color,price,mfd);
					
					laptops.add(laptop);
				
				return Laptop;
			}
			catch{
				e.printStackTrace();
				return null;
			}
			
			
		}
	}

	public List<Laptop> displayAllLaptopDao() {
		// TODO Auto-generated method stub
		return null;
	}

	public Laptop displayLaptopByIdDao(int i) {
		// TODO Auto-generated method stub
		PreparedStatement ps = connection.prepareStatement(DISPLAY_SINGLE_LAPTOP_QUERY);
		ps.setInt(1, id1);
		ResultSet set = ps.executeQuery();
		
		if(set.next()) {
			
			int id = set.getInt("id");
			String name = set.getString("name");
			String color = set.getString("color");
			
		}
		
		return null;
	}
	
	public Laptop displayLaptopByNameQuery() {
		
		Prepared ps connection.prepareStatement(DISPLAY_BY_NAME_QUERY);
		ps.setInt(2,name1);
		
		
	}

	public int updateLaptopNameByIdDao(int id, String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteLaptopByIdDao(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
