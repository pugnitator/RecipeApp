package com.example.recipeapp

object STUB {
    private val categories = setOf<Category>(
        Category(
            0,
            "Бургеры",
            "Рецепты всех популярных видов бургеров",
            "C:\\Users\\tsver\\StudioProjects\\RecipeApp\\app\\src\\main\\assets\\burger.png"
        ),
        Category(
            1,
            "Десерты",
            "Самые вкусные рецепты десертов специально для вас",
            "C:\\Users\\tsver\\StudioProjects\\RecipeApp\\app\\src\\main\\assets\\dessert.png"
        ),
        Category(
            2,
            "Пицца",
            "Пицца на любой вкус и цвет. Лучшая подборка для тебя",
            "C:\\Users\\tsver\\StudioProjects\\RecipeApp\\app\\src\\main\\assets\\pizza.png"
        ),
        Category(
            3,
            "Рыба",
            "Печеная, жареная, сушеная, любая рыба на твой вкус",
            "C:\\Users\\tsver\\StudioProjects\\RecipeApp\\app\\src\\main\\assets\\fish.png"
        ),
        Category(
            4,
            "Супы",
            "От классики до экзотики: мир в одной тарелке",
            "C:\\Users\\tsver\\StudioProjects\\RecipeApp\\app\\src\\main\\assets\\soup.png"
        ),
        Category(
            5,
            "Салаты",
            "Хрустящий калейдоскоп под соусом вдохновения",
            "C:\\Users\\tsver\\StudioProjects\\RecipeApp\\app\\src\\main\\assets\\salad.png"
        )
    )

    fun getCategories() = categories
}