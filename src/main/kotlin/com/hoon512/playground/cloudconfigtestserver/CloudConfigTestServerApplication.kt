package com.hoon512.playground.cloudconfigtestserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudConfigTestServerApplication

fun main(args: Array<String>) {
    runApplication<CloudConfigTestServerApplication>(*args)
}
