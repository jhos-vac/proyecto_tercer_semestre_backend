package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.PostulationView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostulationViewRepository:JpaRepository <PostulationView,Long>{
    fun  findById(id:Long?):PostulationView?
}