// 1 Modelo o entidad (base de datos)
// 2 Interface (crud)
// 3 Repositorio (Metodos para consumir el crud)
// 4 Servicios (que no halla campos vacios etc)
// 5 Controlador web (creamos la url de la api rest)

package Reto3Domingo.Reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto3Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}

}
