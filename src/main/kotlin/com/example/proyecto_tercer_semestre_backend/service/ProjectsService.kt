package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Project
import com.example.proyecto_tercer_semestre_backend.repository.ProjectRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception

@Service
class ProjectsService {
    @Autowired
    lateinit var projectRepository: ProjectRepository

    fun list() :List<Project>{
        return projectRepository.findAll()
    }

    fun save (project: Project):Project{
        return projectRepository.save(project)
    }
    fun update(project: Project): Project {
        try {
            projectRepository.findById(project.id)
                ?:throw  Exception("id no existe")
            return projectRepository.save(project)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }


}