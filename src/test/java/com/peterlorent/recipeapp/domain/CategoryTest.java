package com.peterlorent.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setup() {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long id = 4L;
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }

}