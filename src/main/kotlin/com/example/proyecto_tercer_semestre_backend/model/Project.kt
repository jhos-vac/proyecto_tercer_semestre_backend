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
class Project {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id:Long?= null
    var title: String?= null
    var estimate: Int? = null
    var description: String?= null
    @Column (name = "estimated_time")
    var estimatedTime: Date?=null
    @Column (name = "work_level")
    var workLevel: String?=null
    @Column (name = "type_work")
    var typeWork: String?=null
}