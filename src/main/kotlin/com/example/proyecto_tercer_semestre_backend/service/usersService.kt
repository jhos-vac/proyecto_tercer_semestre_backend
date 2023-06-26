package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.model.Users
import com.example.proyecto_tercer_semestre_backend.repository.usersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception
@Service
class usersService {
    @Autowired
    lateinit var usersRepository: usersRepository
    fun list() :List<Users>{
        return usersRepository.findAll()
    }

    fun save (users: Users): Users {
        return usersRepository.save(users)
    }

    fun update(users: Users): Users {
        try {
            usersRepository.findById(users.id)
                ?:throw  Exception("id no existe")
            return usersRepository.save(users)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun updateData (users: Users): Users
    {
        try {
            val response= usersRepository.findById(users.id)
                ?:throw Exception("ID no existe")
            response.apply {
                fullname = users.fullname
            }
            return usersRepository.save(response)
        }
        catch (ex: Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

}