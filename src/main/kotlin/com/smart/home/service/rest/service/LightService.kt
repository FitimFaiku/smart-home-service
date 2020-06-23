package com.smart.home.service.rest.service

import com.smart.home.service.rest.model.Blind
import com.smart.home.service.rest.model.Light
import com.smart.home.service.rest.repository.BlindRepository
import com.smart.home.service.rest.repository.LightRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class LightService(val lightRepository: LightRepository) {
    fun getAllLights(): List<Light> {
        val blinds = lightRepository.findAll()
        return blinds.toList()
    }

    fun addNewLight(light:Light):Light{
        return lightRepository.save(light)
    }
    fun deleteLight(uuid: UUID){
        return lightRepository.deleteById(uuid)
    }

    fun getLight(uuid: UUID): Optional<Light> {
        return lightRepository.findById(uuid)
    }

    fun changeDimmingValue(uuid: UUID, value:Int){
        val oldLight = lightRepository.findById(uuid);
        if(oldLight.isPresent){
            oldLight.get().dimmingValue = value
            lightRepository.save(oldLight.get())
        }
    }
}