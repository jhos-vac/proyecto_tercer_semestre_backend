package com.example.proyecto_tercer_semestre_backend.service

import com.example.proyecto_tercer_semestre_backend.Dto.ProjectDTO
import com.example.proyecto_tercer_semestre_backend.Dto.SkillDTO
import com.example.proyecto_tercer_semestre_backend.Dto.UsersDTO
import com.example.proyecto_tercer_semestre_backend.repository.ProjectRepository
import com.example.proyecto_tercer_semestre_backend.repository.SkillsRepository
import com.example.proyecto_tercer_semestre_backend.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ProjectSkillsService {
    @Autowired
    lateinit var projectRepository: ProjectRepository

    @Autowired
    lateinit var skillsRepository: SkillsRepository

    @Autowired
    lateinit var usersRepository: UsersRepository


    fun getAllProjectsWithSkill(): List<ProjectDTO> {
        val projects = projectRepository.findAll()
        return projects.map { project ->
           val skills = skillsRepository.findByIdProject(project.id)
           ProjectDTO(
                id = project.id,
                title = project.title,
                estimate = project.estimate,
                description = project.description,
                estimatedTime = project.estimatedTime,
                workLevel = project.workLevel,
                typeWork = project.typeWork,
                skills = skills.map { skill ->
                    val users = usersRepository.findByIdSkill(skill.id)
                    SkillDTO(
                        id= skill.id,
                        idProject = skill.idProject,
                        description = skill.description,
                        users = users.map{ user ->
                            UsersDTO(
                                id= user.id,
                                fullname = user.fullname,
                                email = user.email,
                                contact = user.contact,
                                states = user.states,
                                idSkill = user.idSkill,
                            )

                        }
                    )

                } ,

            )
        }
    }
}

