package com.example.y3final

import androidx.recyclerview.widget.DiffUtil

class ContactDiffCallback : DiffUtil.ItemCallback<Contact>() {
    override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
        // Επιστρέφει true αν τα αντικείμενα είναι ίδια (π.χ., από μοναδικό ID)
        return oldItem.phone == newItem.phone
    }

    override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
        // Επιστρέφει true αν το περιεχόμενο των αντικειμένων είναι ίδιο
        return oldItem == newItem
    }
}
