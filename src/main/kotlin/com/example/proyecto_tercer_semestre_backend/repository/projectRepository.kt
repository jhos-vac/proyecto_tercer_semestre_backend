package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Project
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface projectRepository:JpaRepository <Project,Long> {
    fun findById(id:Long?):Project?
}