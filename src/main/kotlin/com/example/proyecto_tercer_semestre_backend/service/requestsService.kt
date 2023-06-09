package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Requests
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
    fun list() :List<Requests>{
        return requestsRepository.findAll()
    }

    fun save (requests: Requests): Requests {
        return requestsRepository.save(requests)
    }

    fun update(requests: Requests): Requests {
        try {
            requestsRepository.findById(requests.id)
                ?:throw  Exception("id no existe")
            return requestsRepository.save(requests)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateData (requests: Requests): Requests {
        try {
            val response= requestsRepository.findById(requests.id)
                ?:throw Exception("ID no existe")
            response.apply {
                states= requests.states
            }
            return requestsRepository.save(response)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

}