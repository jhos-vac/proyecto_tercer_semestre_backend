package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.Apply
import com.example.proyecto_tercer_semestre_backend.model.ApplyView
import com.example.proyecto_tercer_semestre_backend.service.ApplyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/apply")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class ApplyController {
    @Autowired
    lateinit var applyService: ApplyService
    @GetMapping
    fun list():List<Apply>{
        return applyService.list()
    }

    @GetMapping("/view")
    fun listView():List<ApplyView>{
        return applyService.listView()
    }

    @PostMapping
    fun save(@RequestBody apply: Apply): Apply?{
        return applyService.save(apply)
    }

    @PutMapping
    fun  update (@RequestBody apply: Apply): ResponseEntity<Apply> {
        return ResponseEntity(applyService.update(apply), HttpStatus.OK)
    }

    @PatchMapping
    fun updateData (@RequestBody apply: Apply): ResponseEntity<Apply> {
        return ResponseEntity(applyService.updateData(apply), HttpStatus.OK)
    }
}