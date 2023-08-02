package com.example.proyecto_tercer_semestre_backend.repository

import com.example.proyecto_tercer_semestre_backend.model.ProjectSkills
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectSkillsRepository: JpaRepository<ProjectSkills, Long> {
    fun findById(id:Long?): ProjectSkills?
}