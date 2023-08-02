package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.Postulation
import com.example.proyecto_tercer_semestre_backend.model.PostulationView
import com.example.proyecto_tercer_semestre_backend.service.PostulationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/postulation")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class PostulationController {
    @Autowired
    lateinit var applyService: PostulationService
    @GetMapping
    fun list():List<Postulation>{
        return applyService.list()
    }

    @GetMapping("/view")
    fun listView():List<PostulationView>{
        return applyService.listView()
    }

    @PostMapping
    fun save(@RequestBody postulation: Postulation): Postulation?{
        return applyService.save(postulation)
    }

    @PutMapping
    fun  update (@RequestBody postulation: Postulation): ResponseEntity<Postulation> {
        return ResponseEntity(applyService.update(postulation), HttpStatus.OK)
    }

    @PatchMapping
    fun updateData (@RequestBody postulation: Postulation): ResponseEntity<Postulation> {
        return ResponseEntity(applyService.updateData(postulation), HttpStatus.OK)
    }
}