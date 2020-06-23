package com.smart.home.service.rest.controller

import com.smart.home.service.rest.model.Light
import com.smart.home.service.rest.service.LightService
import org.springframework.web.bind.annotation.*
import java.util.*
import java.util.concurrent.atomic.AtomicLong


@RestController
@RequestMapping("/light")
class LightController(val lightService: LightService) {
    val counter = AtomicLong()

    @GetMapping("/all")
    fun position(): List<Light> {
        return lightService.getAllLights()
    }

    @PostMapping("/add")
    fun add(@RequestBody  newLight:Light): Light {
        return lightService.addNewLight(newLight)
    }

    @PostMapping("/value/{id}/{value}")
    fun setDimmingValue(@PathVariable("id") id:UUID,@PathVariable("value") value:Int ) {
        return lightService.changeDimmingValue(id, value)
    }

    @DeleteMapping("/delete/{id}")
    fun remove(@PathVariable("id") id:UUID) {
        lightService.deleteLight(id)
    }
}