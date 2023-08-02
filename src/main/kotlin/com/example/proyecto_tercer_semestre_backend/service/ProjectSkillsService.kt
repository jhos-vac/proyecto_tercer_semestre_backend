package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.ProjectSkills
import com.example.proyecto_tercer_semestre_backend.model.ProjectSkillsView
import com.example.proyecto_tercer_semestre_backend.repository.ProjectSkillsRepository
import com.example.proyecto_tercer_semestre_backend.repository.ProjectSkillsViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ProjectSkillsService {
    @Autowired
    lateinit var projectSkillsRepository: ProjectSkillsRepository
    @Autowired
    lateinit var projectSkillsViewRepository: ProjectSkillsViewRepository

    fun  listView(): List<ProjectSkillsView>{
        return projectSkillsViewRepository.findAll()
    }
    fun list():List <ProjectSkills>{
        return projectSkillsRepository.findAll()
    }

    fun save (projectSkills: ProjectSkills): ProjectSkills {
        return projectSkillsRepository.save(projectSkills)
    }

}