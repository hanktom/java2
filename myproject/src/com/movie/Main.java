package com.movie;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Movie> movies = Movie.getAllMovies();
//		for (Movie m : movies){
		for (int i=0; i<movies.size(); i++){
			Movie m = movies.get(i);
			System.out.println((i+1)+":"+m.getName()+"/"+m.duration);
		}
		System.out.print("請輸入電影編號:");
		Scanner scanner = new Scanner(System.in);
		int mid = scanner.nextInt();
//		System.out.println(movies.get(mid-1).getId());
		Movie movie = movies.get(mid-1);
		List<Play> plays = movie.getPlays();
		for (int i=0; i<plays.size();i++){
			Play p = plays.get(i);
			System.out.println((i+1)+":"+p.getTime());
		}
		System.out.print("請輸入場次:");
		int pid = scanner.nextInt();
		Play play = plays.get(pid-1);
		System.out.print("請輸入票數:");
		int tickets = scanner.nextInt();
		List<Seat> seats = play.reserve(tickets);
		for (Seat seat: seats){
			System.out.println(seat.getPlayId()+"/"+seat.getSeatNo());
		}
		
	}

}
