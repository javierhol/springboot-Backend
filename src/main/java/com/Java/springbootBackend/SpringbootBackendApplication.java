package com.Java.springbootBackend;

import com.Java.springbootBackend.model.Empleado;
import com.Java.springbootBackend.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Override
	public void run(String... args) throws Exception {
		Empleado empleado = new Empleado();
		empleado.setNombre("Juan");
		empleado.setApellido("Perez");
		empleado.setEmail("Juan@gmail.com");
		empleadoRepository.save(empleado);

		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Maria");
		empleado1.setApellido("Perez");
		empleado1.setEmail("Maria@gmail.com");
		empleadoRepository.save(empleado1);

	}
}
