package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.Project
import com.example.proyecto_tercer_semestre_backend.model.ProjectView
import com.example.proyecto_tercer_semestre_backend.service.ProjectsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/project")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class ProjectsController {
    @Autowired
    lateinit var projectsService: ProjectsService
    @GetMapping
    fun list():List<Project>{
    return projectsService.list()
    }

    @GetMapping("/view")
    fun listView():List<ProjectView>{
        return projectsService.listView()
    }

    @PostMapping
    fun save(@RequestBody projects: Project):Project?{
        return projectsService.save(projects)
    }

    @PutMapping
    fun  update (@RequestBody projects: Project):ResponseEntity<Project>{
        return ResponseEntity(projectsService.update(projects),HttpStatus.OK)
    }

    @PatchMapping
    fun updateData (@RequestBody projects: Project): ResponseEntity<Project>{
        return ResponseEntity(projectsService.updateData(projects),HttpStatus.OK)
    }

}