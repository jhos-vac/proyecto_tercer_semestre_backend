package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository:JpaRepository <Users,Long> {
    fun findById(id:Long?):Users?
    fun findByIdSkill(idSkills:Long?): List<Users>
}