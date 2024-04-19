package com.example.recipeapp

data class Category(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
)

data class Ingredient(
    val description: String,
    val quantity: String,
    val unitOfMeasure: String,
)

data class Recipe(
    val id: Int,
    val title: String,
    val ingredients: List<Ingredient>,
    val method: String,
    val imageUrl: String,
)