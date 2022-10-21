package com.mercadolivro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyMarketplaceApplication

fun main(args: Array<String>) {
	runApplication<MyMarketplaceApplication>(*args)
}
