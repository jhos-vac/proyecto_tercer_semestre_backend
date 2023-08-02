package com.example.proyecto_tercer_semestre_backend.repository
import com.example.proyecto_tercer_semestre_backend.model.ProjectSkillsView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectSkillsViewRepository: JpaRepository<ProjectSkillsView, Long> {
    fun findById(id:Long?): ProjectSkillsView?
}