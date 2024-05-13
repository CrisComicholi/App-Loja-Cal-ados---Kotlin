package com.example.applojadecalcados.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applojadecalcados.databinding.ShoesItemBinding
import com.example.applojadecalcados.model.Shoes

class ShoesAdapter(private val context: Context, private val shoesList: MutableList<Shoes>):
    RecyclerView.Adapter<ShoesAdapter.ShoesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoesViewHolder {
        val listItem = ShoesItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ShoesViewHolder(listItem)
    }

    override fun getItemCount() = shoesList.size

    override fun onBindViewHolder(holder: ShoesViewHolder, position: Int) {
        holder.binding.imgShoes.setBackgroundResource(shoesList[position].imgShoes!!)
        holder.binding.txtShoesName.text = shoesList[position].shoesName
        holder.binding.txtShoesDescription.text = shoesList[position].shoesDescription
        holder.binding.txtPrice.text = shoesList[position].price
    }

    inner class ShoesViewHolder(val binding: ShoesItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imgShoes = binding.imgShoes
        val txtShoesName = binding.txtShoesName
        val txtShoesDescription = binding.txtShoesDescription
        val txtPrice = binding.txtPrice
    }
}
