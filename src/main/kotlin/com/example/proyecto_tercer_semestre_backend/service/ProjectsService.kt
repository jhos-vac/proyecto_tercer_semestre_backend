package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Project
import com.example.proyecto_tercer_semestre_backend.model.ProjectView
import com.example.proyecto_tercer_semestre_backend.repository.projectRepository
import com.example.proyecto_tercer_semestre_backend.repository.projectViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus

import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception

@Service
class ProjectsService {
    @Autowired
    lateinit var projectRepository: projectRepository
    @Autowired
    lateinit var projectViewRepository: projectViewRepository
    fun  listView() :List<ProjectView>{
        return projectViewRepository.findAll()
    }
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
    fun updateData (project: Project):Project
    {
        try {
            val response= projectRepository.findById(project.id)
                ?:throw Exception("ID no existe")
            response.apply {
                title = project.title
            }
            return projectRepository.save(response)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

}