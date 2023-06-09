package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Skills
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface skillsRepository:JpaRepository<Skills,Long> {
    fun findById(id:Long?):Skills?
}