package com.khaledachech.scuttleback.service.storage.itf;

import com.khaledachech.scuttleback.model.storage.Document;
import com.khaledachech.scuttleback.model.storage.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<Project> get();
    Project getById(long id);
    Project save(Project project);
    Project update(long id,Project project);
    List<Project> delete(long id);

}
