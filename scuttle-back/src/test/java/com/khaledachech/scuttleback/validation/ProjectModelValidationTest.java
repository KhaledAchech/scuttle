package com.khaledachech.scuttleback.validation;

import com.khaledachech.scuttleback.model.storage.Document;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectModelValidationTest {

    static TypeValidationTest typeValidationTest = new TypeValidationTest();

    // For now I don't see a use for testing the documents;
    // but I will keep the static injection as a reminder if needed in the future.
    static DocumentModelValidationTest documentModelValidationTest = new DocumentModelValidationTest();

    @Test
    public void testName(String name) {
        typeValidationTest.testString(name);
        assertTrue (name.length() <= 50);
    }

    @Test
    public void testBriefDescription(String description) {
        typeValidationTest.testString(description);
        assertTrue (description.length() <= 120);
    }

    @Test
    public void testLongDescription(String description) {
        typeValidationTest.testString(description);
        assertTrue (description.length() <= 250);
    }

    @Test
    public void testVisibility(int visibility) {
        typeValidationTest.testBoolean(visibility);
    }

}
