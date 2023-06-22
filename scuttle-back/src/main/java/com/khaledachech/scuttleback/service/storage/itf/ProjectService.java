package com.khaledachech.scuttleback.service.storage.itf;

import com.khaledachech.scuttleback.model.storage.Project;

import java.util.List;

public interface ProjectService {
    List<Project> get();
    Project getById(long id);
    Project save(Project project);
    Project update(long id,Project project);
    List<Project> delete(long id);

}
