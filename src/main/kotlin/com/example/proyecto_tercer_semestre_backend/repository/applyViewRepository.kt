package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.ApplyView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface applyViewRepository:JpaRepository <ApplyView,Long>{
    fun  findById(id:Long?):ApplyView?
}