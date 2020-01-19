package com.example.android.livedadaviewmoudle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var moudle: NameViewMoudle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       moudle= ViewModelProviders.of(this).get(NameViewMoudle::class.java)

       val nameObserver = Observer<String> { newName ->
           nameTextView.text = newName
       }

       moudle.currentName.observe(this, nameObserver)

        button1.setOnClickListener {
            moudle.currentName.value = "余文建"
        }
    }
}
