package com.khaledachech.scuttleback.service.storage.impl;

import com.khaledachech.scuttleback.model.storage.Document;
import com.khaledachech.scuttleback.model.storage.Project;
import com.khaledachech.scuttleback.repository.storage.DocumentRepository;
import com.khaledachech.scuttleback.repository.storage.ProjectRepository;
import com.khaledachech.scuttleback.service.storage.itf.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;
    private DocumentRepository documentRepository;
    @Override
    public List<Project> get() {
        return projectRepository.findAll();
    }

    @Override
    public Project getById(long id) { return projectRepository.findById(id).get(); }

    @Override
    public Project save(Project project) {
        for (Document doc: project.getDocuments()) {
            if (doc.getProject() == null) doc.setProject(project);
        }
        projectRepository.save(project);
        if (project.getDocuments().size() > 0) documentRepository.saveAll(project.getDocuments());
        return project;
    }

    @Override
    public List<Project> delete(long id) {
        return null;
    }

    @Override
    public List<Document> listProjectDocuments(long id) {
        Project project = projectRepository.findById(id).get();
        return project.getDocuments();
    }
}
