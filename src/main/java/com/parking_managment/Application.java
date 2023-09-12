package com.parking_managment;

import com.parking_managment.entity.Car;
import com.parking_managment.entity.Card;
import com.parking_managment.entity.Person;
import com.parking_managment.service.CardServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


		/*Car car = new Car();
		car.setMarque("Toyota");
		car.setImmatriculation("DG-252-HG");
		car.setModele("aygo");

		List<Car> cars = new ArrayList<>();
		cars.add(car);
		//instancier person
		Person person = new Person();
		person.setGenre("Homme");
		person.setNom("SALL");
		person.setPrenom("Mouhamadou");
		person.setCars(cars);
		//instancier card
		Card card = new Card();
		card.setNumber("C1");
		card.setPerson(person);

		CardServiceImpl cardService = new CardServiceImpl();
		cardService.addCard(card);
*/

	}

}
