package com.smart.home.service.rest.controller

import com.smart.home.service.rest.model.Light
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong


@RestController
@RequestMapping("/light")
class LightController {
    val counter = AtomicLong()

    @GetMapping("/position")
    fun position(): Light {
        return Light(1, "short Description", 100)
    }

//    @PostMapping("/add")
//    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) {
//
//    }
}