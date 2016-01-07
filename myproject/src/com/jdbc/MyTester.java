package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import com.parking.Car;
import com.parking.ParkingLot;

public class MyTester {

	public static void main(String[] args) {
		String url = "jdbc:mysql://j.snpy.org/java1?"
				+ "user=java1&password=jjaa989&"
				+ "useUnicode=true&characterEncoding=UTF-8";
		ParkingLot lot = new ParkingLot();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url);
//			query(lot, conn);
			String carId = "AABB";
			PreparedStatement pstmt = 
					conn.prepareStatement("insert into parking2(car_id, ctime, type) values(?,?,?)");
			pstmt.setString(1, carId);
			pstmt.setTimestamp(2, new Timestamp(new Date().getTime()));
			pstmt.setInt(3, 0);
			pstmt.execute();
			
			/*Statement stmt = conn.createStatement();
			String sql = "insert into parking2(car_id, ctime, type) values("
					+ " '"+carId+"', '2016-01-06', 0)";*/
//			stmt.execute(sql);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void query(ParkingLot lot, Connection conn) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from parking");
		while(rs.next()){
			String cid = rs.getString("car_id");
			Timestamp ts = rs.getTimestamp("ctime");
			Date date = new Date(ts.getTime());
			//Date date = rs.getDate("ctime");
			int type = rs.getInt("type");
			System.out.println(cid+"/"+date+"/"+type);
			Car c = new Car(cid, date);
			if (type==0){
				lot.add(c);
			}else{
				int fee = lot.remove(c);
				System.out.println(fee);
			}
		}
	}

}



