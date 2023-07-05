package com.example.proyecto_tercer_semestre_backend.model

import jakarta.persistence.*

@Entity
@Table(name = "apply_view")
class ApplyView {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    @Column(updatable = false)
    var id:Long?= null
    @Column(name = "id_users")
    var idUsers:Int?= null
    @Column(name = "id_project")
    var idProject:Int?= null
    var states:String?= null
    var user:String?=null
    var project:String?=null
}