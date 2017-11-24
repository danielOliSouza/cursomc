package br.com.daniel.cursomc;

import java.io.Serializable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements Serializable{

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
}
