package br.com.linux.photo.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.linux.photo.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        title = "Welcome to Photo"

        nextPageRegister()
    }

    private fun nextPageRegister() {

    }
}