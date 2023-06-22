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
        return null;
    }

    @Override
    public Document getById(long id) {
        return null;
    }

    @Override
    public Document save(Document document) {
        return null;
    }

    @Override
    public Document update(long id, Document document) {
        return null;
    }

    @Override
    public List<Document> delete(long id) {
        return null;
    }
}
