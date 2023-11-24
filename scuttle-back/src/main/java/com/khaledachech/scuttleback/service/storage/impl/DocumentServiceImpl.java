package com.khaledachech.scuttleback.service.storage.impl;

import com.khaledachech.scuttleback.model.storage.Document;
import com.khaledachech.scuttleback.repository.storage.DocumentRepository;
import com.khaledachech.scuttleback.service.storage.itf.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private DocumentRepository documentRepository;
    @Override
    public List<Document> get() {
        return documentRepository.findAll();
    }

    @Override
    public Document getById(long id) { return documentRepository.findById(id).get(); }

    @Override
    public Document save(Document document) {
        documentRepository.save(document);
        return document;
    }

    @Override
    public List<Document> delete(long id) {
        documentRepository.delete(documentRepository.findById(id).get());
        return documentRepository.findAll();
    }

    @Override
    public void deleteAll() {
        documentRepository.deleteAll();
    }
}
