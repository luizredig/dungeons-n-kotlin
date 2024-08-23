package dungeons_n_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DungeonsNKotlinApplication

fun main(args: Array<String>) {
//	runApplication<DungeonsNKotlinApplication>(*args)

	var isGameRunning: Boolean = true
	do {

		println("Selecione uma opção:")
		println("(1) Criar personagem \n(2) Sair")
		var response = readLine()
		when(response){
			"1" -> println("AAAAAA")
			"2" -> isGameRunning = false
			else -> throw error("Invalid response")
		}

	}while (isGameRunning)

}

//Fazer menu com duas opções criar personagem ou sair
//definir nome, raça e atributo -> criar personagens | Distribuição de 27 pontos nos atributos

