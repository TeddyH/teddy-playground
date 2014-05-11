package com.teddy.refactoring.example;

/**
 * @author Teddy
 * 대여 정보 클래스 
 * 
 */
public class Rental {

	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	
	// 비디오 종류별 대여료 계산 기능을 빼내어 별도의 메소드로 작성
	double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	
	// 최신물을 이틀 이상 대여하면 2포인트 지급하고 그 외엔 1포인트 지급하는 코드를
	// 빼내 getFrequentRenterPoints 메서드로 만들고 이 Rental 클래스로 옮겼다.
	int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
