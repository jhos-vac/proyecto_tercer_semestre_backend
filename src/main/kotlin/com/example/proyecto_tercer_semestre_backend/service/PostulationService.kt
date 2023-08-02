package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Postulation
import com.example.proyecto_tercer_semestre_backend.model.PostulationView
import com.example.proyecto_tercer_semestre_backend.repository.PostulationRepository
import com.example.proyecto_tercer_semestre_backend.repository.PostulationViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception

@Service
class PostulationService {
    @Autowired
    lateinit var postulationRepository: PostulationRepository
    @Autowired
    lateinit var postulationViewRepository: PostulationViewRepository

    fun listView():List<PostulationView>{
        return postulationViewRepository.findAll()
    }
    fun list() :List<Postulation>{
        return postulationRepository.findAll()
    }
    fun save (apply: Postulation): Postulation {
        return postulationRepository.save(apply)
    }
    fun update(apply: Postulation):Postulation{
        try {
            postulationRepository.findById(apply.id)
                ?:throw  Exception("id no existe")
            return postulationRepository.save(apply)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateData (apply: Postulation): Postulation
    {
        try {
            val response= postulationRepository.findById(apply.id)
                ?:throw Exception("ID no existe")
            response.apply {
                states = apply.states
            }
            return postulationRepository.save(response)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}