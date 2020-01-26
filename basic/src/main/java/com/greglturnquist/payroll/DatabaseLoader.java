
package com.greglturnquist.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final BookRepository repository;

	@Autowired
	public DatabaseLoader(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new All_stories(1,"KolorMagii"));
		//this.repository.save(new All_stories(2,"Blask Fantastyczny"));
		//this.repository.save(new All_stories(3,"Czarodzicielstwo"));
		//this.repository.save(new All_stories(4,"Równoumagicznienie"));
		//this.repository.save(new All_stories(5,"Mort"));
	}
}
/*


@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
*/
