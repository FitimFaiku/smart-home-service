package com.smart.home.service.rest.repository

import com.smart.home.service.rest.model.Blind
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BlindRepository: CrudRepository<Blind, UUID> {

}