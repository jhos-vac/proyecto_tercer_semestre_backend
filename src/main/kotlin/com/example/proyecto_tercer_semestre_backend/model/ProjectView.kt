package com.example.proyecto_tercer_semestre_backend.model

import jakarta.persistence.*
import java.util.*
@Entity
@Table(name = "project_view")
class ProjectView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id:Long?= null
    @Column(name = "id_users")
    var idUsers:Int?= null
    var title: String?= null
    var budget: Double? =null
    var description: String?= null
    @Column(name = "start_date")
    var startDate: Date?=null
    var users:String? = null
}