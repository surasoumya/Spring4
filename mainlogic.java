package com.first;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainlogic {

	public static void main(String args[]) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
		Car cr = (Car) ac.getBean("nano");
		cr.move();
		Bike b = (Bike) ac.getBean("Apache");
		b.move();

}
}