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
@Table(name = "projects")
class Projects {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id:Long?= null
    var title: String?= null
    var description: String?= null
    @NotNull(message = "Campo Obligatorio")
    var id_users:Int?= null
    var start_date: Date?=null
    var estimated_duration: Int?= null
    var budget: Double?= null
}