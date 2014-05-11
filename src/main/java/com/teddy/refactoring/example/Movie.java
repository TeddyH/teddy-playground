package com.teddy.refactoring.example;

/**
 * @author Teddy
 * 간단한 비디오 데이터 클래스
 */
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	
	private Price _price;
	
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return _price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
		}
	}
	
	public String getTitle() {
		return _title;
	}
	
	// 비디오 종류별 대여료 계산 기능을 빼내어 별도의 메소드로 작성
	double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2) {
				result += (daysRented - 2) * 1.5;
			}
			break;
			
		case Movie.NEW_RELEASE: 
			result += daysRented * 3;
			break;
			
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 3) * 1.5;
			}
			break;
		}
		return result;
	}
	
	// 최신물을 이틀 이상 대여하면 2포인트 지급하고 그 외엔 1포인트 지급하는 코드를
	// 빼내 getFrequentRenterPoints 메서드로 만들고 이 Rental 클래스로 옮겼다.
	int getFrequentRenterPoints(int daysRented) {
		if ((getPriceCode() == Movie.NEW_RELEASE) && 
				daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}
}