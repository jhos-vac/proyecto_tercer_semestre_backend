package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Projects
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface projectsRepository:JpaRepository <Projects,Long> {
    fun findById(id:Long?):Projects?
}