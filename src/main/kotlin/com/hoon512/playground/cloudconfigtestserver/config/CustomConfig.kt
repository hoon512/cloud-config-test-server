package com.hoon512.playground.cloudconfigtestserver.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "custom")
data class CustomConfig(
    val propertyName: String,
    val value: Int,
    val list: List<Int>
)