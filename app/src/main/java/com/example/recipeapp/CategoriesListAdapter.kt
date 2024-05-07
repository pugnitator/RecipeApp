package com.example.recipeapp

import android.graphics.drawable.Drawable.createFromStream
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.databinding.ItemCategoryBinding
import java.io.FileNotFoundException
import java.io.InputStream

class CategoriesListAdapter(
    private val dataSet: List<Category>,
    private var itemClickListener: OnItemClickListener? = null
) : RecyclerView.Adapter<CategoriesListAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick()
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        itemClickListener = listener
        itemClickListener?.onItemClick()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemCategoryBinding.bind(itemView)
        val ivCategory: ImageView = binding.ivCategoryItem
        val tvTitle: TextView = binding.tvCategoryItemTitle
        val tvDescription: TextView = binding.tvCategoryItemDescription
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = dataSet[position]

        val image = try {
            val inputStream: InputStream? =
                holder.ivCategory.context?.assets?.open(category.imageUrl)
            createFromStream(inputStream, category.imageUrl)
        } catch (e: FileNotFoundException) {
            val tag = "CategoryListAdapter"
            val errorLog = Log.e(tag, "Failed to retrieve file from assets", e)
            R.drawable.stub.toDrawable()
        }

        with(holder) {
            ivCategory.setImageDrawable(image)
            ivCategory.contentDescription = "Изображение категории ${category.title}"
            tvTitle.text = category.title
            tvDescription.text = category.description
            itemView.setOnClickListener { itemClickListener?.onItemClick() }
        }
    }

    override fun getItemCount(): Int {
        return STUB.getCategories().size
    }
}