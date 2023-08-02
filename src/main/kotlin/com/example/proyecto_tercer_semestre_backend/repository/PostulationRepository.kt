package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Postulation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostulationRepository:JpaRepository<Postulation,Long> {
    fun findById(id:Long?):Postulation?
}