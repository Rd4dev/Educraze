package com.rd.educraze

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(val courseList: ArrayList<Course>): RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {
    class CourseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val courseImageView: ImageView = itemView.findViewById(R.id.iv_course_image)
        val courseNameTextView: TextView = itemView.findViewById(R.id.tv_course_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.courses_card, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = courseList[position]
        holder.courseImageView.setImageResource(course.courseImage)
        holder.courseNameTextView.text = course.courseName
    }

    override fun getItemCount(): Int {
        return courseList.size
    }
}