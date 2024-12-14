package org.mrowrpurr.todosapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodosApiApplication

fun main(args: Array<String>) {
	runApplication<TodosApiApplication>(*args)
}


