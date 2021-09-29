# AuthFirebase

```
dependencies {
    implementation 'com.google.firebase:firebase-auth-ktx:21.0.1'
    }
```

```
plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'com.google.gms.google-services'
    id 'kotlin-android-extensions'
}
```

# AuthFirebase With Email
1- Sign Up
```
    private lateinit var auth: FirebaseAuth;
    
    
    ````
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
```

