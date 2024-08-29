package br.com.linux.photo.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.linux.photo.databinding.ActivityHomeBinding
import br.com.linux.photo.extensions.goingTo

class HomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loginButtonConf()
        registerButtonConf()
    }

    private fun loginButtonConf() {
        binding.loginBtn.setOnClickListener {

        }
    }

    private fun registerButtonConf() {
        binding.registerBtn.setOnClickListener {
            this.goingTo(RegisterActivity::class.java)
        }
    }
}