package com.hoon512.playground.cloudconfigtestserver.component

import com.hoon512.playground.cloudconfigtestserver.config.CustomConfig
import org.springframework.stereotype.Component

@Component
class CustomComponent(
    private val customConfig: CustomConfig
) {
    fun describeConfig(): String = "property name = ${customConfig.propertyName}, value = ${customConfig.value}"
}