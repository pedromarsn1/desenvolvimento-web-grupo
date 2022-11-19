package br.com.apiconsumer

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.apiconsumer.databinding.ActivityMainBinding
import br.com.apiconsumer.models.Animal

class AnimalAdapter(private val animal : ArrayList<Animal>): RecyclerView.Adapter<AnimalViewHolder>(),
    ListAdapter {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        val binding = ActivityMainBinding.bind(view)
        return AnimalViewHolder(binding)
    }

    override fun getItemCount(): Int = animal.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animal[position])
    }
}