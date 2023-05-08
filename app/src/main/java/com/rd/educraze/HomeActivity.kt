package com.rd.educraze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private lateinit var coursesRecyclerView: RecyclerView
    private lateinit var courseList: ArrayList<Course>
    private lateinit var courseAdapter: CourseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
    }

    private fun init(){
        coursesRecyclerView = findViewById(R.id.rv_courses)
        coursesRecyclerView.layoutManager = GridLayoutManager(this, 2)

        courseList = ArrayList()
        dummyCourseData()

        courseAdapter = CourseAdapter(courseList)
        coursesRecyclerView.adapter = courseAdapter
    }

    private fun dummyCourseData(){
        courseList.add(Course(R.drawable.educraze_logo, "Python"))
        courseList.add(Course(R.drawable.educraze_logo, "Kotlin"))
        courseList.add(Course(R.drawable.educraze_logo, "ML/AI"))
        courseList.add(Course(R.drawable.educraze_logo, "JavaScript"))
        courseList.add(Course(R.drawable.educraze_logo, "Java"))
        courseList.add(Course(R.drawable.educraze_logo, "Swift"))
    }
}