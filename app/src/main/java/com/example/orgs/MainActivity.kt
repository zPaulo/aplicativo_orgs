package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Hello, World!", Toast.LENGTH_SHORT).show()
    }
}