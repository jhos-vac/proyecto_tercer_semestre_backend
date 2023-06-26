package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Skills
import com.example.proyecto_tercer_semestre_backend.repository.skillsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception
import java.sql.DatabaseMetaData

@Service
class skillsService {
    @Autowired
    lateinit var skillsRepository: skillsRepository
    fun list():List <Skills>{
        return skillsRepository.findAll()
    }

    fun save (skills: Skills):Skills{
        return skillsRepository.save(skills)
    }

    fun  update (skills: Skills):Skills{
        try {
            skillsRepository.findById(skills.id)
                ?:throw  Exception("id no existe")
            return skillsRepository.save(skills)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

    fun updateData (skills: Skills):Skills
    {
        try {
            val response= skillsRepository.findById(skills.id)
                ?:throw Exception("ID no existe")
            response.apply {
                description = skills.description
            }
            return skillsRepository.save(skills)
        }catch  (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}