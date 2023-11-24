package com.khaledachech.scuttleback.controller.storage;

import com.khaledachech.scuttleback.model.storage.Document;
import com.khaledachech.scuttleback.model.storage.Project;
import com.khaledachech.scuttleback.service.storage.itf.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController (ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAll() { return projectService.get(); }

    @GetMapping("/{id}")
    public Project getById(@PathVariable long id) { return projectService.getById(id); }

    @GetMapping("/listDocuments/{id}")
    public List<Document> listDocuments(@PathVariable long id) { return projectService.listProjectDocuments(id); }

    @PostMapping
    public Project save(@RequestBody Project project) { return projectService.save(project); }
}
