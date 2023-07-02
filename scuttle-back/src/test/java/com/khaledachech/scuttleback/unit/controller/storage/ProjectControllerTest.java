package com.khaledachech.scuttleback.unit.controller.storage;

import com.khaledachech.scuttleback.controller.storage.ProjectController;
import com.khaledachech.scuttleback.model.storage.Project;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest(ProjectController.class)
class ProjectControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProjectController projectController;

    @Test
    void getAll() throws Exception {
        Project project = new Project();
        project.setName("Demo");

        List allProjects = singletonList(project);

        given(projectController.getAll()).willReturn(allProjects);

        mvc.perform(get("/api/projects"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is(project.getName())));
    }

    @Test
    void getById() {
    }

    @Test
    void save() {
    }
}