package com.khaledachech.scuttleback.repository.storage;

import com.khaledachech.scuttleback.model.storage.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
