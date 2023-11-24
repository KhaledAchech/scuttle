package com.khaledachech.scuttleback.controller.storage;

import com.khaledachech.scuttleback.model.storage.Document;
import com.khaledachech.scuttleback.service.storage.itf.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    private DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService){
        super();
        this.documentService = documentService;
    }

    @GetMapping
    public List<Document> getAll(){ return documentService.get(); }

    @GetMapping("/{id}")
    public Document getById(@PathVariable long id) { return documentService.getById(id); }

    @PostMapping
    public Document save (@RequestBody Document document) { return documentService.save(document); }

    @DeleteMapping("/{id}")
    public List<Document> delete(@PathVariable long id) { return documentService.delete(id); }

    @DeleteMapping
    public void deleteAll(){ documentService.deleteAll(); }
}
