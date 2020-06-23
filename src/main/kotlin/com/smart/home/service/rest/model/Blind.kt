package com.smart.home.service.rest.model

import java.util.*
import javax.persistence.*

@Entity
@Table
data class Blind (
        // @JsonProperty("id")
//        @JsonIgnore
        @Id
        @GeneratedValue
        @Column(name = "id", length = 16, unique = true, nullable = false)
        val id: UUID? = null,

        val description: String = "",

        var positionInPercent: Int = 0
) {
        override fun toString(): String {
                return this.toString()
        }
}

