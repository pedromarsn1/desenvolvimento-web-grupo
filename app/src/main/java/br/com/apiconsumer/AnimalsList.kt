package br.com.apiconsumer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.apiconsumer.databinding.ActivityAnimalsListBinding
import br.com.apiconsumer.models.Animal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AnimalsList : AppCompatActivity() {
    lateinit var binding : ActivityAnimalsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var call : Call<List<Animal>>? = RetrofitClient.instance?.getApi()?.getAnimals()
        call?.enqueue(object : Callback<List<Animal>>{
            override fun onResponse(call: Call<List<Animal>>,
                                    response: Response<List<Animal>>) {

                if( response.isSuccessful){
                    response.body()?.let {
                        binding.listAnimals.adapter = AnimalAdapter(it as ArrayList<Animal>)
                        binding.listAnimals.layoutManager = LinearLayoutManager(this@AnimalsList)
                        binding.progressBar.visibility = View.GONE
                        binding.listAnimals.visibility = View.VISIBLE
                    }
                }
            }

            override fun onFailure(call: Call<List<Animal>>, t: Throwable) {
                binding.progressBar.visibility = View.GONE
                binding.error.visibility = View.VISIBLE
            }

        })
    }
}