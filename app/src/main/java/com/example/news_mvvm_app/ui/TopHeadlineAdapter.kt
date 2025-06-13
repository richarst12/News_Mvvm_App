package com.example.news_mvvm_app.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.news_mvvm_app.data.model.Article
import com.example.news_mvvm_app.databinding.TopHeadlineItemLayoutBinding
import androidx.core.net.toUri

class TopHeadlineAdapter(private val articleList: ArrayList<Article>) :
    RecyclerView.Adapter<TopHeadlineAdapter.DataViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = DataViewHolder(
        TopHeadlineItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )


    override fun onBindViewHolder(
        holder: DataViewHolder,
        position: Int
    ) = holder.bind(articleList[position])

    override fun getItemCount(): Int {
        return articleList.size
    }

    class DataViewHolder(private val binding: TopHeadlineItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Article) {
            binding.textViewTitle.text = article.title
            binding.textViewDescription.text = article.description
            binding.textViewSource.text = article.source.name
            Glide.with(binding.imageViewBanner).load(article.imageUrl).into(binding.imageViewBanner)
            itemView.setOnClickListener {
                val builder = CustomTabsIntent.Builder()
                val customTabsIntent = builder.build()
                customTabsIntent.launchUrl(it.context, article.url.toUri())
            }
        }
    }

    fun addData(list: List<Article>) {
        articleList.addAll(list)
    }

}