package com.smart.home.service.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigInteger
import java.util.*
import javax.persistence.*

@Entity
@Table
data class Light (
        // @JsonProperty("id")
        @Id
        @GeneratedValue
        @Column(name = "id", length = 16, unique = true, nullable = false)
        val id: UUID? = null,

        val description: String = "",

        var dimmingValue: Int = 0
) {
    override fun toString(): String {
        return this.toString()
    }
}