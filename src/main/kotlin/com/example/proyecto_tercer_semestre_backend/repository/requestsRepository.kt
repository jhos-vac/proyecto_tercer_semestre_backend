package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Apply
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface requestsRepository:JpaRepository<Apply,Long> {
    fun findById(id:Long?):Apply?
}