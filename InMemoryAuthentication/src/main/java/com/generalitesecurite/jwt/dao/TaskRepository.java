package com.generalitesecurite.jwt.dao;

import com.generalitesecurite.jwt.entites.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {

}
