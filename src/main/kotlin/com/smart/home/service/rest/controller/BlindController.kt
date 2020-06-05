package com.smart.home.service.rest.controller

import com.smart.home.service.rest.model.Blind
import com.smart.home.service.rest.service.BlindService
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/blind")
class BlindController(val blindService: BlindService) {


    @GetMapping("/all/position")
    fun position(): List<Blind> {
        return blindService.getAllBlinds()
    }

    @GetMapping("/position")
    fun getPosition(@RequestParam(value = "uuid") uuid: UUID): Optional<Blind> {
        return blindService.getBlind(uuid)
    }

    @PostMapping("/add")
    fun add(@RequestBody  newBlind: Blind): Blind {
        return blindService.addNewBlind(newBlind)
    }
}