package it.italiaonline.mail.passionsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import it.italiaonline.mail.passionsapp.R
import it.italiaonline.mail.passionsapp.databinding.PassionItemBinding
import it.italiaonline.mail.passionsapp.model.Passion

class PassionRecyclerViewAdapter(private val passionsList: List<Passion>):
    RecyclerView.Adapter<PassionRecyclerViewAdapter.ViewHolder>() {

    private lateinit var ctx: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        ctx = parent.context
        val inflater = LayoutInflater.from(parent.context)
        val binding: PassionItemBinding = DataBindingUtil.inflate(inflater, R.layout.passion_item, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(passionsList[position])
    }

    override fun getItemCount(): Int = passionsList.size

    inner class ViewHolder(private val binding: PassionItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(passion: Passion) {
            binding.apply {
                ivPassion.setImageResource(passion.image)
                txtPassion.text = passion.name
            }
        }
    }
}