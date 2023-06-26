package com.example.proyecto_tercer_semestre_backend.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import java.util.Date

@Entity
@Table(name = "requests")
class Apply {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    @Column(updatable = false)
    var id:Long?= null
    @Column(name = "id_users")
    var idUsers:Int?= null
    @Column (name = "id_project")
    var idProject:Int?= null
    var states:String?= null
}