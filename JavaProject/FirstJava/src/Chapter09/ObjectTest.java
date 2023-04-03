package Chapter09;

public class ObjectTest {

	public static void main(String[] args) {
		Car c1 = new Car("0223a001");
		Car c2 = new Car("2023B001");
		Car c3 = c1;
		Car c4 = new Car("0223a001");

		System.out.println(c1.toString());
		System.out.println(c2.toString());

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(null));
		System.out.println(c1.equals("0223a001"));

	}

}

class Car {

	String CarNo;

	Car(String carNo) {
		this.CarNo = carNo;
	}

	@Override
	public boolean equals(Object obj) {
		// obj => null =< false
		// obj => Car 타입으로 형변환 가능해야 한다
		Car car = null;
		if (obj != null && obj instanceof Car) {
			// obj => 형변환하고 carNo 비교해서 결과값을 반환

			car = (Car) obj;
			// 문자열을 비교해서 같은지 여부 반환
			if (CarNo.equals(car.CarNo)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return CarNo + " 차량입니다.";
	}

}

