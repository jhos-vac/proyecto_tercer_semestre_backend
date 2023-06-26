package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.Skills
import com.example.proyecto_tercer_semestre_backend.service.skillsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class skillsController {
    @Autowired
    lateinit var skillsService: skillsService
    @GetMapping
    fun list():List<Skills>{
        return skillsService.list()
    }

    @PostMapping
    fun save(@RequestBody skills: Skills): Skills?{
        return skillsService.save(skills)
    }

    @PutMapping
    fun  update (@RequestBody skills: Skills): ResponseEntity<Skills> {
        return ResponseEntity(skillsService.update(skills), HttpStatus.OK)
    }

    @PatchMapping
    fun updateData (@RequestBody skills: Skills): ResponseEntity<Skills> {
        return ResponseEntity(skillsService.updateData(skills), HttpStatus.OK)
    }
}