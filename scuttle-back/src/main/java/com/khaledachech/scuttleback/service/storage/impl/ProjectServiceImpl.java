package com.khaledachech.scuttleback.service.storage.impl;

import com.khaledachech.scuttleback.model.storage.Project;
import com.khaledachech.scuttleback.repository.storage.ProjectRepository;
import com.khaledachech.scuttleback.service.storage.itf.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;
    @Override
    public List<Project> get() {
        return projectRepository.findAll();
    }

    @Override
    public Project getById(long id) { return projectRepository.findById(id).get(); }

    @Override
    public Project save(Project project) {
        projectRepository.save(project);
        return project;
    }

    @Override
    public Project update(long id, Project project) {
        return null;
    }

    @Override
    public List<Project> delete(long id) {
        return null;
    }
}
