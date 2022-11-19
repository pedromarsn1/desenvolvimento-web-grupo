package br.com.apiconsumer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.apiconsumer.databinding.ActivityMainBinding
import br.com.apiconsumer.models.Animal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var call : Call<Animal>? = RetrofitClient.instance?.getApi()?.getRandomAnimal()
        call?.enqueue(object : Callback<Animal>{
            override fun onResponse(call: Call<Animal>, response: Response<Animal>) {
                if (response.isSuccessful){
                    response.body().let {
                        binding.listAnimal.adapter = AnimalAdapter(it as ArrayList<Animal>)
                    }
                }
            }

            override fun onFailure(call: Call<Animal>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })
    }
}