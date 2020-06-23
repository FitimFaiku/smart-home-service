package com.smart.home.service.rest.controller

import com.smart.home.service.rest.model.Blind
import com.smart.home.service.rest.service.BlindService
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/blind")
class BlindController(val blindService: BlindService) {


    @GetMapping("/all")
    fun position(): List<Blind> {
        return blindService.getAllBlinds()
    }

    @PostMapping("/add")
    fun add(@RequestBody  newBlind: Blind): Blind? {
        if(!newBlind.description.isNullOrEmpty()){
            return blindService.addNewBlind(newBlind)
        }
        return null
    }
    @PostMapping("/position/{id}/{value}")
    fun setPosition(@PathVariable("id") id:UUID,@PathVariable("value") value:Int ) {
        return blindService.changePosition(id, value)
    }

    @DeleteMapping("/delete/{id}")
    fun remove(@PathVariable("id") id:UUID) {
        blindService.deleteBlind(id)
    }
}