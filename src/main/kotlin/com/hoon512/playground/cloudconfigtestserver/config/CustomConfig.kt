package com.hoon512.playground.cloudconfigtestserver.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

//@ConfigurationProperties(prefix = "custom")
//data class CustomConfig(val propertyName: String)


@RefreshScope
@Component
class CustomConfig(
    @Value("\${custom.property-name}")
    val propertyName: String,

    @Value("\${custom.value}")
    val value: Int
)