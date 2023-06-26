package com.example.proyecto_tercer_semestre_backend.controller

import com.example.proyecto_tercer_semestre_backend.model.Projects
import com.example.proyecto_tercer_semestre_backend.model.Users
import com.example.proyecto_tercer_semestre_backend.service.usersService
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class usersController {
    @Autowired
    lateinit var usersService: usersService
    @GetMapping
    fun list():List<Users>{
        return usersService.list()
    }

    @PostMapping
    fun save(@RequestBody users: Users): Users?{
        return usersService.save(users)
    }

    @PutMapping
    fun  update (@RequestBody users: Users): ResponseEntity<Users> {
        return ResponseEntity(usersService.update(users), HttpStatus.OK)
    }

    @PatchMapping
    fun updateData (@RequestBody users: Users): ResponseEntity<Users> {
        return ResponseEntity(usersService.updateData(users),HttpStatus.OK)
    }
}