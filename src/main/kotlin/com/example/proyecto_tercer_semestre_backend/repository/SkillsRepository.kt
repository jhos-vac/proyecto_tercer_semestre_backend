package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.Skills
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface SkillsRepository:JpaRepository<Skills,Long> {
    fun findById(id:Long?):Skills?

    fun findByIdProject(idProject: Long?): List<Skills>
}