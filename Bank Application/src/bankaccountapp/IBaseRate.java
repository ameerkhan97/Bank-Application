package bankaccountapp;

public interface IBaseRate {
	//Write a method that returns the base rate
	default double getbaserate() {
		return 2.5;
	}
}
