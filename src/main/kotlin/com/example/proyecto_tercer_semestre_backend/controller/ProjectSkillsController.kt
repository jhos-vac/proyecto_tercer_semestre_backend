package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.ProjectSkills
import com.example.proyecto_tercer_semestre_backend.model.ProjectSkillsView
import com.example.proyecto_tercer_semestre_backend.service.ProjectSkillsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/projectSkills")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class ProjectSkillsController {
    @Autowired
    lateinit var projectSkillsService: ProjectSkillsService

    @GetMapping("/view")
    fun listView():List<ProjectSkillsView>{
        return projectSkillsService.listView()
    }
    @GetMapping
    fun list():List<ProjectSkills>{
        return projectSkillsService.list()
    }
    @PostMapping
    fun save(@RequestBody projectSkills: ProjectSkills):ProjectSkills{
        return projectSkillsService.save(projectSkills)
    }

}