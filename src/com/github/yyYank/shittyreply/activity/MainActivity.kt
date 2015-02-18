package com.github.yyYank.shittyreply.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity () : Activity() {
    /**
     * Called when the activity is first created.
     */
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Hello Kotlin", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.main)
    }
}