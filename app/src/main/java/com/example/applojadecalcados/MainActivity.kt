package com.example.applojadecalcados

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applojadecalcados.adapter.ShoesAdapter
import com.example.applojadecalcados.databinding.ActivityMainBinding
import com.example.applojadecalcados.model.Shoes

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  lateinit var shoesAdapter: ShoesAdapter
    private val shoesList: MutableList<Shoes> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewShoes: RecyclerView = binding.RecyclerViewShoes
        recyclerViewShoes.layoutManager = LinearLayoutManager(this)
        recyclerViewShoes.setHasFixedSize(true)
        shoesAdapter = ShoesAdapter(this,shoesList)
        recyclerViewShoes.adapter = shoesAdapter
        getShoes()

    }

    private fun getShoes(){

        val tenis1 = Shoes(
            imgShoes = R.drawable.tenis1,
            shoesName = "Tenis 1",
            shoesDescription = "Tênis Botinha Converse All Star Adulto Chuck Taylor - Marrom",
            price = "R$ 323,00"
        );
        shoesList.add(tenis1)



        val tenis2 =  Shoes(
            imgShoes = R.drawable.tenis2,
            shoesName = "Tenis 1",
            shoesDescription = "Tênis All Star Adulto Chuck Taylor - Amarelo",
            price = "R$ 223,00"
        );
        shoesList.add(tenis2);



        val tenis3 =  Shoes(
            imgShoes = R.drawable.tenis3,
            shoesName = "Tenis 1",
            shoesDescription = "Tênis Converse All Star Adulto Chuck Taylor - Prata",
            price = "R$ 123,00"
        );
        shoesList.add(tenis3);


        val tenis4 =  Shoes(
            imgShoes = R.drawable.tenis4,
            shoesName = "Tenis 1",
            shoesDescription = "Tênis Camurça Esqueitista - Marrom",
            price = "R$ 123,00"
        );
        shoesList.add(tenis4);

        val tenis5 =  Shoes(
            imgShoes = R.drawable.tenis5,
            shoesName = "Tenis 1",
            shoesDescription = "Tênis All Star - Azul Bebê",
            price = "R$ 153,00"
        );
        shoesList.add(tenis5);
    }
}