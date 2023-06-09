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
class Requests {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    @Column(updatable = false)
    var id:Long?= null
    @NotNull (message = "Campo Obligatorio")
    var id_users:Int?= null
    @NotNull (message = "Campo Obligatorio")
    var id_project:Int?= null
    @NotNull (message = "Campo Obligatorio")
    var id_worker:Int?= null
    var states:String?= null
    var date_requests:Date?= null
    var response_date:Date?= null
}