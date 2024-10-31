package io.github.angelogalvao.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.dekorate.openshift.annotation.OpenshiftApplication;

@OpenshiftApplication(expose = true)
@SpringBootApplication
public class ArtemisClientExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtemisClientExampleApplication.class, args);
	}

}
