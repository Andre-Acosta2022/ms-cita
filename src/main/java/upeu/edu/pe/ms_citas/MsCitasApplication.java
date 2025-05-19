package upeu.edu.pe.ms_citas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "upeu.edu.pe.ms_citas.Client")
public class MsCitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCitasApplication.class, args);
	}

}
