package com.example.proyecto_tercer_semestre_backend.model

import jakarta.persistence.*

@Entity
@Table(name = "postulation_view")
class PostulationView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?= null
    var state: String? = null
    var skill : String? = null
    var fullname: String?= null
    var description: String?=null
}