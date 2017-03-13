package test;


public class Address {
	
	
	
	public Address() {
		System.out.println("Inside Address Constructor");
	}

	private String city;
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	public void setState(String state) {
		this.state = state;
	}

}