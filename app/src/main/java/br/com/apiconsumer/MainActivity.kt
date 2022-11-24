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
    }
}