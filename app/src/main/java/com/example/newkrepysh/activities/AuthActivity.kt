package com.example.newkrepysh.activities

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.widget.addTextChangedListener
import com.example.newkrepysh.utils.ComponentManager
import com.example.newkrepysh.ui.main.MainActivity
import com.example.newkrepysh.R
import com.example.newkrepysh.databinding.ActivityAuthBinding
import com.example.newkrepysh.entities.auth.AuthBody
import com.example.newkrepysh.factory.ViewModelFactory
import com.example.newkrepysh.local.ErrorHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    var authBody = AuthBody()

    var pass = ""
    var phone = ""
    @Inject

    lateinit var factory: ViewModelFactory
    private val model: AuthActivityViewModel by viewModels { factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ComponentManager.instance.getActivityComponent(this).inject(this)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.phoneNumberLayout.editText?.addTextChangedListener { text->
            phone = text.toString()
            authBody.phone = text.toString()
        }

        binding.passwordLayot.editText?.addTextChangedListener { text->
            pass = text.toString()
            authBody.password = text.toString()
        }


        binding.btnEnter.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                model.auth(pass, phone, this@AuthActivity)
            }
        }
        model.liveDataAuth.observe(this){
            println(it)
            when (it){
                ErrorHandler.success -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
                ErrorHandler.serverError -> {
                    var dialog = Dialog(this)
                    dialog.setContentView(R.layout.error_auth_layout)
                    dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
                    dialog.show()
                }
            }
        }
    }
}