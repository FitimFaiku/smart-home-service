package com.smart.home.service.rest.repository

import com.smart.home.service.rest.model.Light
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LightRepository: CrudRepository<Light, UUID> {

}