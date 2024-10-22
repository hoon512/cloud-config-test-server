package com.hoon512.playground.cloudconfigtestserver.controller

import com.hoon512.playground.cloudconfigtestserver.component.CustomComponent
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/custom")
class CustomController(
    val customComponent: CustomComponent
) {

    @GetMapping("/configuration")
    fun describeConfig() = ResponseEntity.ok(customComponent.describeConfig())
}