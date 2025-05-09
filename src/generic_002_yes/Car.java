package generic_002_yes;

public class Car {
	String carName;
	String carProduct;
	int carYear;
	int maxLoad;
	
	public Car() {}

	public Car(String carName, String carProduct, int carYear, int maxLoad) {
		this.carName = carName;
		this.carProduct = carProduct;
		this.carYear = carYear;
		this.maxLoad = maxLoad;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarProduct() {
		return carProduct;
	}
	public void setCarProduct(String carProduct) {
		this.carProduct = carProduct;
	}

	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public int getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carProduct=" + carProduct 
				+ ", carYear=" + carYear + ", maxLoad="	+ maxLoad + "]";
	}
	
}
