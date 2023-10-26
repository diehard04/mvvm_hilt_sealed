package com.example.hiltsealed.ui.theme.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.hiltsealed.R
import com.example.hiltsealed.data.model.Employee
import com.example.hiltsealed.data.model.Posts

class PostAdapter(private val context: Context, private var employeeList: List<Employee>) :
    BaseAdapter() {

    override fun getCount(): Int {
        return employeeList.size
    }

    override fun getItem(position: Int): Any {
        return employeeList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false)
            viewHolder = ViewHolder(
                view.findViewById(R.id.name),
                view.findViewById(R.id.email),
                view.findViewById(R.id.age)
            )
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val employee = employeeList[position]
        viewHolder.nameTextView.text = "Name: ${employee.name}"
        viewHolder.emailTextView.text = "Email: ${employee.email}"
        viewHolder.ageTextView.text = "Age: ${employee.age}"

        return view
    }

    private class ViewHolder(
        val nameTextView: TextView,
        val emailTextView: TextView,
        val ageTextView: TextView
    )


    fun setData(postList: List<Employee>) {
        this.employeeList = postList
        notifyDataSetChanged()
    }
}
