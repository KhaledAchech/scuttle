package com.khaledachech.scuttleback.validation;

import com.khaledachech.scuttleback.model.storage.Project;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static com.khaledachech.scuttleback.model.storage.Document.DocsType;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocumentModelValidationTest {

    static TypeValidationTest typeValidationTest = new TypeValidationTest();
    static ProjectModelValidationTest projectModelValidationTest = new ProjectModelValidationTest();

    private static final Pattern EXTENSION_PATTERN = Pattern.compile("^\\.[a-zA-Z0-9]+$");
    private static final List DOC_TYPES = new ArrayList<>(Arrays.asList(DocsType.IMAGE, DocsType.FILE, DocsType.FOLDER, DocsType.BIN, DocsType.DATA, DocsType.OBJECT));

    @Test
    public void testName(String name) {
        typeValidationTest.testString(name);
        assertTrue (name.length() <= 50);
    }

    @Test
    public void testExtension(String extension) {
        typeValidationTest.testString(extension);
        assertTrue(EXTENSION_PATTERN.matcher(extension).matches());
    }

    @Test
    public void testDocType(DocsType docType) {
        assertFalse(docType == null);
        assertTrue(DOC_TYPES.contains(docType));
    }

    @Test
    public void testVisibility(int visibility) {
        typeValidationTest.testBoolean(visibility);
    }

    @Test
    public void testProject(Project project) {
        assertFalse(project == null);
        projectModelValidationTest.testName(project.getName());
        projectModelValidationTest.testBriefDescription(project.getBriefDescription());
        projectModelValidationTest.testLongDescription(project.getLongDescription());
        projectModelValidationTest.testVisibility(project.getVisibility());
    }
}
