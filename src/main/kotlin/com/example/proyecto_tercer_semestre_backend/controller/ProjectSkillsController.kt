package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.Dto.ProjectDTO
import com.example.proyecto_tercer_semestre_backend.service.ProjectSkillsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/projectSkills")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class ProjectSkillsController {
    @Autowired
    lateinit var projectSkillService: ProjectSkillsService

    @GetMapping
    fun getAllProjectsWithSkills(): ResponseEntity<List<ProjectDTO>> {
        val projectSkillDtos = projectSkillService.getAllProjectsWithSkill()
        return ResponseEntity.ok(projectSkillDtos)
    }
}