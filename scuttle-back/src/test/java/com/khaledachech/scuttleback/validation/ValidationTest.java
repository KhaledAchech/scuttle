package com.khaledachech.scuttleback.validation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationTest {

    private static final Pattern STRING_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern MAIL_PATTERN = Pattern.compile("^(.+)@(.+)$");
    private static final List BOOL_RANGE = new ArrayList<>(Arrays.asList(true, false, 1, 0));

    @Test
    public void testString(String s) {
        assertTrue(STRING_PATTERN.matcher(s).matches());
    }

    @Test
    public void testMail(String mail) {
        assertTrue(MAIL_PATTERN.matcher(mail).matches());
    }

    @Test
    public void testBoolean(int bool) {
        assertTrue(BOOL_RANGE.contains(bool));
    }

    @Test
    public void testBoolean(boolean bool) {
        assertTrue(BOOL_RANGE.contains(bool));
    }

    @Test
    public void testNullable(Object object) {
        assertNull(object);
    }

    @Test
    public <T> boolean testAllElementsSameObject(List l, Class<T> c) {
        for (Object value : l) {
            assertTrue(c.isInstance(value));
        }
        return true;
    }
}
