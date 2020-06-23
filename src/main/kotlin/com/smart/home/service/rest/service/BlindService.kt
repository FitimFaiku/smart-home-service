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
    fun changePosition(uuid: UUID, positionValue:Int){
        val oldBlind = blindRepository.findById(uuid);
        if(oldBlind.isPresent){
            oldBlind.get().positionInPercent = positionValue
            blindRepository.save(oldBlind.get())
        }
    }
    fun deleteBlind(uuid: UUID){
        return blindRepository.deleteById(uuid)
    }

    fun getBlind(uuid: UUID): Optional<Blind> {
        return blindRepository.findById(uuid)
    }
}