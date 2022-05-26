package com.example.newkrepysh.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newkrepysh.R
import com.example.newkrepysh.ui.main.MainActivity
import com.example.newkrepysh.utils.TokenProvider
import com.example.newkrepysh.utils.replaceActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onStart() {
        super.onStart()
            if (checkAuth()) {
                replaceActivity(MainActivity())
            } else {
                replaceActivity(AuthActivity())
            }



    }
    private fun checkAuth(): Boolean {
        return TokenProvider.getToken(this).isNotEmpty()
    }
}
