package com.example.authfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        auth = Firebase.auth


        btnSignUp.setOnClickListener {

            auth.createUserWithEmailAndPassword(
                Email_SignUp.text.toString().trim(),
                Pass_SignUp.text.toString().trim()
            )
                .addOnCompleteListener(this) {
                    if (it.isSuccessful) {
                        Toast.makeText(
                            baseContext, "SignUp Done.",
                            Toast.LENGTH_LONG
                        ).show()
                        val intent = Intent(this, Home::class.java)
                        startActivity(intent)

                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(
                            baseContext, "SignUp failed.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }


        }




    }
}