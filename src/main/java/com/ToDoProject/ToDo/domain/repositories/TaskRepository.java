package com.ToDoProject.ToDo.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ToDoProject.ToDo.domain.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
