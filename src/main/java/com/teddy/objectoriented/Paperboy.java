package com.teddy.objectoriented;
/* 데미테르의 법칙을 설명할 때 사용되는 유명한 예로 신문 배달부 예제를 통해서 
 * 데미테르의 법칙이 캡슐화를 강화시켜 주는 것을 확인할 수 있다.
 * 
 * 신문 배달부가 고객에게 요금을 받아 가는 상황을 코드로 만들어 보자. 먼저 고객과 지갑을 위한 클래스를 
 * 각각 다음과 같이 만들 수 있을 것이다.
 * 
 */

//고객
class Customer {
	private Wallet wallet;
	public Wallet getWallet() {
		return wallet;
	}
	
	// 변경 후
	public int getPayment(int payment) throws NotEnoughMoneyException {
		if (wallet == null) {
			throw new NotEnoughMoneyException();
		}
		if (wallet.getTotalMoney() >= payment) {
			wallet.substractMoney(payment);
			return payment;
		}
		throw new NotEnoughMoneyException();
	}
	// 생략
}

//지갑
class Wallet {
	private int money;
	public int getTotalMoney() {
		return money;
	}
	
	public void substractMoney(int debit) {
		money -= debit;
	}
	
	// 생략
}

// 신문 배달부 클래스는 고객에게 요금을 받기 위해 아래와 같은 코드를 작성할 것이다.
public class Paperboy {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		int payment = 10000;
		
		// 변경 전
//		Wallet wallet = customer.getWallet();	// 고객님 지갑 주세요.
//		if (wallet.getTotalMoney() >= payment) {	// 지갑에 돈이 있는지 확인합니다. 
//			wallet.substractMoney(payment);	// 지갑에서 돈을 빼가겠습니다.
//			
//		} else {
//			// 다음에 요금 받으러 오는 처리
//		}
		
		// 변경 후
		/* Customer 클래스의 getPayment() 메서드는 지갑에 요청한 금액의 돈이 있으면 그 만큼의 돈을 
		 * 지불하고 없으면 NotEnoughMoneyException을 발생한다.
		 * 
		 * 변경된 코드에서 눈 여겨 볼 점은 이제 신문 배달부는 더 이상 고객의 지갑을 뒤지지 않는다는 점이다.
		 * 그냥 고객으로부터 돈을 받아 가고 끝난다.
		 */
		try {
			int paidAmount = customer.getPayment(payment);
		} catch (NotEnoughMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* 이 두 코드를 보면 이전 코드는 데미테르의 법칙을 어기고 있다.
		 * Paperboy 클래스 입장에서 customer 객체의 메서드만 사용해야 한느데, customer 객체를 통해서
		 * 가져온 wallet 객체의 메서드를 호출하고 있다. 반면에 변경된 코드는 데미테르의 법칙에 따라
		 * customer 객체의 메서드만 호출하고 있다.
		 * 
		 * 만약 지갑이 null이 돌 수 있거나 지갑이 아니라 주머니에서 돈을 꺼내어 준다거나 할 때, 이전 방식의
		 * 코드는 영향을 받는데 반해 변경된 코드는 영향을 받지 않는다. 즉, 변경된 코드는 데미테르의 법칙을 
		 * 지키기 위해 자연스럽게 Customer 객체의 getPayment() 메서드를 호출하는 것으로 바뀌었고, 
		 * 이것이 비용 지불 기능에 대한 캡슐화를 향상시켜 준 덕택에 변경에 영향을 받지 않게 된 것이다.
		 * 
		 * 데미테르의 법칙을 지키지 않는 전형적인 증상 두 가지가 있는데, 이 둘은 다음과 같다.
		 * > 연속된 get 메서드 호출
		 * > 임시 변수의 get 호출이 많음
		 * 
		 */
		
	}
}
/* 강도가 아닌 다음에야 어떤 신문 배달부도 개곡의 주머니에서 지갑을 꺼내서 직접 지갑에 돈이 들었는지 확인한 뒤에,
 * 돈을 가져가지 않는다. 게다가 고객은 지갑이 없을 수도 있고 지갑이 아니라 주머니에서 꼬깃꼬깃한 돈을 꺼내서 줄 수도 있다.
 * 지갑이 아니라 주머니에서 돈을 꺼내야 하는 경우 앞서 작성한 코드는 바뀌게 된다.
 * 이제 신문 배달부는 지갑뿐만 아니라 고객의 주머니까지도 뒤져야 하는 상황이 발생하는 것이다.
 * 
 * 실제로 신문 배달부 입장에서는 고객이 지갑을 가졌는지 또는 돈을 주머니에 보관하고 있는지 여부는 중요하지 않다.
 * 단지 고객으로부터 요금을 받아 가기만 하면 된다.
 * 
 * 좀 더 현실적으로 코드를 바꿔 보자. 이제 신문 배달부가 직접 지갑을 뒤지지 않고 고객이 돈을 지불하는 방식으로 바꾼다.
 */


