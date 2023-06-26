package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.Projects
import com.example.proyecto_tercer_semestre_backend.service.SkillsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class projectsController {
    @Autowired
    lateinit var projectsService: SkillsService
    @GetMapping
    fun list():List<Projects>{
    return projectsService.list()
    }

    @PostMapping
    fun save(@RequestBody projects: Projects):Projects?{
        return projectsService.save(projects)
    }

    @PutMapping
    fun  update (@RequestBody projects: Projects):ResponseEntity<Projects>{
        return ResponseEntity(projectsService.update(projects),HttpStatus.OK)
    }

    @PatchMapping
    fun updateData (@RequestBody projects: Projects): ResponseEntity<Projects>{
        return ResponseEntity(projectsService.updateData(projects),HttpStatus.OK)
    }

}