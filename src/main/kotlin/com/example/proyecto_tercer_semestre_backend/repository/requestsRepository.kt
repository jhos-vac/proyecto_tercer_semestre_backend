package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Requests
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface requestsRepository:JpaRepository<Requests,Long> {
    fun findById(id:Long?):Requests?
}