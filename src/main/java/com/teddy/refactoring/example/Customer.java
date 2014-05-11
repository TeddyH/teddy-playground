package com.teddy.refactoring.example;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Teddy
 * 고객 클래스
 * 
 */
public class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
	
	public Customer(String name) { 
		_name = name;
	}
	
	public void addRental(Rental arg) { 
		_rentals.addElement(arg);
	}
	
	public String getName() {
		return _name;
	}
	
	public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String resultMsg = getName() + "고객님의 대여 기록\n";
		
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			
			// 이번에 대여하는 비디오 정보와 대여로를 출력
			resultMsg += "\n\t" + each.getMovie().getTitle() + "\t" +
					String.valueOf(each.getCharge()) + "\n";
		}
		// 푸터 행 추가
		resultMsg += "누적 대여료 : " + String.valueOf(getTotalCharge()) + "\n";
		resultMsg += "적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints());
		
		return resultMsg;
	}
	
	public String htmlStatement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String resultMsg = "<H1><EM>" + getName() + "고객님의 대여 기록</EM></H1><P>\n";
		
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			
			// 이번에 대여하는 비디오 정보와 대여로를 출력
			resultMsg += each.getMovie().getTitle() + " : " +
					String.valueOf(each.getCharge()) + "<BR>\n";
		}
		// 푸터 행 추가
		resultMsg += "<P>누적 대여료 : <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		resultMsg += "적립 포인트 : <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM><P>";
		
		return resultMsg;
	}
	
	private double getTotalCharge() {
		double result = 0;
		
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;		
	}

}
