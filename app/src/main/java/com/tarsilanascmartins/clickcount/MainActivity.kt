package com.tarsilanascmartins.clickcount
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.tarsilanascmartins.clickcount.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var  mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.textResultado.observe(this){
          textResultado -> binding.textResultado.text = textResultado.toString()
        }


        binding.bClique.setOnClickListener {
            Toast.makeText(this, "Vamos lá! Você consegue!", Toast.LENGTH_LONG).show()
          mainViewModel.adicionar()
           mainViewModel.textResultado.value = (binding.textResultado.text as String).toInt()
        }

    }
}