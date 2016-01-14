package com.movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Play {
	int id;
	int movieId;
	Date time;
	public Play(int id, int movieId, Date time) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.time = time;
	}
	
	public List<Seat> reserve(int numOfTicket){
		List<Seat> seats = new ArrayList<>();
		Connection conn = DBUtil.getConnection();
		try {
			String sql = "select * from seats where play_id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.last();
			int seatNo = rs.getInt("seat_no");
			seatNo++;
			String insert = "insert into seats(play_id, seat_no, status)"
					+ "values(?,?, 1)";
			
			for (int i=0;i<numOfTicket;i++){
				PreparedStatement pstmt2 = conn.prepareStatement(insert);
				pstmt2.setInt(1, id);
				pstmt2.setInt(2, seatNo+i);
				int rowCount = pstmt2.executeUpdate();
				System.out.println(rowCount);
				pstmt2.close();
				seats.add(new Seat(id, seatNo+i, 1));
			}
			
			/*while(rs.next()){
				int id = rs.getInt("id");
				int playId = rs.getInt("play_id");
				int seatNo = rs.getInt("seat_no");
				int status = rs.getInt("status");
				System.out.println(id+"/"+seatNo);
			}*/
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return seats;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
