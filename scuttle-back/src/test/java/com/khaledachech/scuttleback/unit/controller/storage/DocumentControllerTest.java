package com.khaledachech.scuttleback.unit.controller.storage;

import com.khaledachech.scuttleback.controller.storage.DocumentController;
import com.khaledachech.scuttleback.model.storage.Document;
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
@WebMvcTest(DocumentController.class)
class DocumentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private DocumentController documentController;

    @Test
    void getAll() throws Exception{
        Document document = new Document();
        document.setName("demo_file");

        List allDocuments = singletonList(document);
        given(documentController.getAll()).willReturn(allDocuments);

        mvc.perform(get("/api/documents"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is(document.getName())));
    }

    @Test
    void getById() {
    }

    @Test
    void save() {
    }
}