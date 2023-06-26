package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Projects
import com.example.proyecto_tercer_semestre_backend.repository.projectsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception

@Service
class SkillsService {
    @Autowired
    lateinit var projectsRepository: projectsRepository
    fun list() :List<Projects>{
        return projectsRepository.findAll()
    }

    fun save (projects: Projects):Projects{
        return projectsRepository.save(projects)
    }

    fun update(projects: Projects):Projects{
        try {
            projectsRepository.findById(projects.id)
                ?:throw  Exception("id no existe")
            return projectsRepository.save(projects)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateData (projects: Projects):Projects{
        try {
            val response= projectsRepository.findById(projects.id)
                ?:throw Exception("ID no existe")
            response.apply {
                title= projects.title
            }
            return projectsRepository.save(response)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }


}