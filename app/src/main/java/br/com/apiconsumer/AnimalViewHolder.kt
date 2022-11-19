package br.com.apiconsumer

import androidx.recyclerview.widget.RecyclerView
import br.com.apiconsumer.databinding.ActivityMainBinding
import br.com.apiconsumer.models.Animal

class AnimalViewHolder(private val binding : ActivityMainBinding) :
RecyclerView.ViewHolder(binding.root){

    //criar activity para animal
    fun bind(animal: Animal){
        binding.animalName.text = animal.name;
        binding.infoText.text = animal.animal_type;
        binding.infoText2.text = animal.diet;
        binding.infoText3.text = animal.active_time;
        binding.infoText4.text = animal.habitat;
        binding.infoText5.text = animal.latin_name;
        binding.infoText6.text = animal.length_max;
        binding.infoText7.text = animal.length_min;
        binding.infoText8.text = animal.lifespan;
        binding.infoText9.text = animal.weight_min;
        binding.infoText10.text = animal.weight_max;
        binding.infoText11.text = animal.geo_range;
        binding.infoText12.text = animal.image_link;

    }
}