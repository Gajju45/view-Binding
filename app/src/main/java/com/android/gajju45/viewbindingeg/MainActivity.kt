package com.android.gajju45.viewbindingeg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.gajju45.viewbindingeg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(
            View.OnClickListener {
                binding.tv1.setText("This is View Binding")
            }
        )
    }
}