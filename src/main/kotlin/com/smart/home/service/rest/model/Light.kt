package com.smart.home.service.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger

data class Light (
        // @JsonProperty("id")
        val id: Int,

        val description: String,

        val dimmingValue: Int
) {}

