package com.peterlorent.recipeapp.service;

import com.peterlorent.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
