package com.khaledachech.scuttleback.service.storage.itf;

import com.khaledachech.scuttleback.model.storage.Document;

import java.util.List;

public interface DocumentService {
    List<Document> get();
    Document getById(long id);
    Document save(Document document);
    Document update(long id,Document document);
    List<Document> delete(long id);
}
