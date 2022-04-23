package com.example.builderpattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.createStudent)
        btn.setOnClickListener {
            var builder = Student.Builder()
            try {
                builder.setStudentName("Abdallah Shnaino")
                var student : Student = builder.Build()
                Toast.makeText(this , "Student Created Successfully" , Toast.LENGTH_SHORT).show()

            }catch (e:Exception){
                Toast.makeText(this , e.message , Toast.LENGTH_SHORT).show()
            }
        }
    }
}