package com.muflidevs.unittestingmockito

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muflidevs.unittestingmockito.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = MainViewModel(CuboidModel())

        binding.btnSave.setOnClickListener(this)
        binding.btnCalculateCircumference.setOnClickListener(this)
        binding.btnCalculateVolume.setOnClickListener(this)
        binding.btnCalculateSurfaceArea.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        val length = binding.edtLength.text.toString().trim()
        val height = binding.edtHeight.text.toString().trim()
        val width = binding.edtWidth.text.toString().trim()

        when {
            TextUtils.isEmpty(length) -> {
                binding.edtLength.error = "FIELD INI TIDAK BOLEH KOSONG PENDO"
            }
            TextUtils.isEmpty(width) -> {

            }
            TextUtils.isEmpty(height) -> {

            }
        }
    }

}