package com.khaledachech.scuttleback.repository.storage;

import com.khaledachech.scuttleback.model.storage.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
