package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.Apply
import com.example.proyecto_tercer_semestre_backend.service.requestsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class requestsController {
    @Autowired
    lateinit var requestsService: requestsService
    @GetMapping
    fun list():List<Apply>{
        return requestsService.list()
    }

    @PostMapping
    fun save(@RequestBody apply: Apply): Apply?{
        return requestsService.save(apply)
    }

    @PutMapping
    fun  update (@RequestBody apply: Apply): ResponseEntity<Apply> {
        return ResponseEntity(requestsService.update(apply), HttpStatus.OK)
    }

    @PatchMapping
    fun updateData (@RequestBody apply: Apply): ResponseEntity<Apply> {
        return ResponseEntity(requestsService.updateData(apply), HttpStatus.OK)
    }
}