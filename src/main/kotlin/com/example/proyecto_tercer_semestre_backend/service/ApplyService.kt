package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Apply
import com.example.proyecto_tercer_semestre_backend.model.ApplyView
import com.example.proyecto_tercer_semestre_backend.repository.applyRepository
import com.example.proyecto_tercer_semestre_backend.repository.applyViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception

@Service
class ApplyService {
    @Autowired
    lateinit var applyRepository: applyRepository
    @Autowired
    lateinit var applyViewRepository: applyViewRepository

    fun listView():List<ApplyView>{
        return applyViewRepository.findAll()
    }
    fun list() :List<Apply>{
        return applyRepository.findAll()
    }
    fun save (apply: Apply): Apply {
        return applyRepository.save(apply)
    }
    fun update(apply: Apply):Apply{
        try {
            applyRepository.findById(apply.id)
                ?:throw  Exception("id no existe")
            return applyRepository.save(apply)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateData (apply: Apply): Apply
    {
        try {
            val response= applyRepository.findById(apply.id)
                ?:throw Exception("ID no existe")
            response.apply {
                states = apply.states
            }
            return applyRepository.save(response)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}