package com.example.proyecto_tercer_semestre_backend.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "skills")
class Skills {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?= null
    @Column (name = "id_users")
    var idUsers:Int?= null
    var fullname:String? =null
    var description:String?= null
}