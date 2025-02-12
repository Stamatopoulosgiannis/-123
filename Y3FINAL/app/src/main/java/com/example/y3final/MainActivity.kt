package com.example.y3final

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var contactAdapter: ContactAdapter
    private val contactViewModel: ContactViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewContacts)
        val fabAdd: FloatingActionButton = findViewById(R.id.fabAddContact)

        contactAdapter = ContactAdapter { contact ->
            // Handle click events, e.g., show details or edit
        }

        recyclerView.adapter = contactAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        contactViewModel.allContacts.observe(this) { contacts ->
            contactAdapter.submitList(contacts)
        }

        fabAdd.setOnClickListener {
            // Open dialog or activity to add a new contact
        }
    }
}

annotation class AndroidEntryPoint

