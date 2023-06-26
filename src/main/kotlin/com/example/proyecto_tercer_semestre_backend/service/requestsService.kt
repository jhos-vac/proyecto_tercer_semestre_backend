package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Apply
import com.example.proyecto_tercer_semestre_backend.repository.requestsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception

@Service
class requestsService {
    @Autowired
    lateinit var requestsRepository: requestsRepository
    fun list() :List<Apply>{
        return requestsRepository.findAll()
    }

    fun save (apply: Apply): Apply {
        return requestsRepository.save(apply)
    }

    fun update(apply: Apply): Apply {
        try {
            requestsRepository.findById(apply.id)
                ?:throw  Exception("id no existe")
            return requestsRepository.save(apply)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateData (apply: Apply): Apply {
        try {
            val response= requestsRepository.findById(apply.id)
                ?:throw Exception("ID no existe")
            response.apply {
                states= apply.states
            }
            return requestsRepository.save(response)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

}