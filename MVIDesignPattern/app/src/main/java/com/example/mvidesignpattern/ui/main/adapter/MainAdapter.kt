package com.example.mvidesignpattern.ui.main.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvidesignpattern.R
import com.example.mvidesignpattern.data.model.User

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var textViewUserName: TextView
        private lateinit var textViewUserEmail: TextView
        private lateinit var imageViewAvatar: ImageView

        fun bind(user: User) {
            textViewUserName = itemView.findViewById(R.id.textViewUserName)
            textViewUserEmail = itemView.findViewById(R.id.textViewUserEmail)
            imageViewAvatar = itemView.findViewById(R.id.imageViewAvatar)
            textViewUserName.text = user.name
            textViewUserEmail.text = user.email
            Glide.with(imageViewAvatar.context)
                .load(user.avatar)
                .into(imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }

}