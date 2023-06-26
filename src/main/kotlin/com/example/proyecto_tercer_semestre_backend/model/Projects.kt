package com.example.proyecto_tercer_semestre_backend.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "projects")
class Projects {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id:Long?= null
    @Column (name = "id_users")
    var idUsers:Int?= null
    var title: String?= null
    var budget: Double? =null
    var description: String?= null
    @Column (name = "start_date")
    var startDate: Date?=null
}