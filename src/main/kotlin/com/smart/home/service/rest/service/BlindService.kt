package com.smart.home.service.rest.service

import com.smart.home.service.rest.model.Blind
import com.smart.home.service.rest.repository.BlindRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class BlindService(val blindRepository: BlindRepository) {
    fun getAllBlinds(): List<Blind> {
        val blinds = blindRepository.findAll()
        return blinds.toList()
    }

    fun addNewBlind(blind: Blind):Blind{
        return blindRepository.save(blind)
    }

    fun getBlind(uuid: UUID): Optional<Blind> {
        return blindRepository.findById(uuid)
    }
}