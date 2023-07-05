package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.ProjectView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface projectViewRepository:JpaRepository <ProjectView,Long> {
    fun findById(id:Long?):ProjectView?
}