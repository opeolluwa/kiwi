package com.opeolluwa

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureAdministration()
    configureSerialization()
    configureDatabases()
    configureMonitoring()
    configureSecurity()
    configureHTTP()
    configureRouting()
}
