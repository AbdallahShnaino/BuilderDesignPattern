package com.example.builderpattern

import android.widget.Toast
import java.lang.Exception

class Student {
    private var studentName : String = ""
    private var studentAge : Int = 0
    private var studentSpecialization : String = ""
    private var studentId : Long = 0
    private var studentGpa : Float = 0.0f
    private var studentLevel : Int = 0
    private var remindingHours : Int = 0
    private var studentState : String = ""

    private constructor(
        studentName: String,
        studentAge: Int,
        studentSpecialization: String,
        studentId: Long,
        studentGpa: Float,
        studentLevel: Int,
        remindingHours: Int,
        studentState: String
    ) {
        this.studentName = studentName
        this.studentAge = studentAge
        this.studentSpecialization = studentSpecialization
        this.studentId = studentId
        this.studentGpa = studentGpa
        this.studentLevel = studentLevel
        this.remindingHours = remindingHours
        this.studentState = studentState
    }


    public fun getStudentName () : String {
        return this.studentName
    }
    public fun getStudentAge () : Int {
        return this.studentAge
    }
    public fun getStudentSpecialization () : String {
        return this.studentSpecialization
    }
    public fun getStudentId () : Long {
        return this.studentId
    }
    public fun getStudentGpa () : Float {
        return this.studentGpa
    }
    public fun getStudentLevel () : Int {
        return this.studentLevel
    }
    public fun getRemindingHours () : Int {
        return this.remindingHours
    }
    public fun getStudentState () : String {
        return this.studentState
    }

        public  class Builder () {
            private var studentName : String = ""
            private var studentAge : Int = 0
            private var studentSpecialization : String = ""
            private var studentId : Long = 0
            private var studentGpa : Float = 0.0f
            private var studentLevel : Int = 0
            private var remindingHours : Int = 0
            private var studentState : String = ""

            public fun setStudentName (studentName : String ) {
                this.studentName = studentName
            }
            public fun setStudentAge (studentAge : Int)  {
                 this.studentAge = studentAge
            }
            public fun setStudentSpecialization (studentSpecialization : String)  {
                this.studentSpecialization = studentSpecialization
            }
            public fun setStudentId (studentId : Long)  {
                 this.studentId = studentId
            }
            public fun setStudentGpa (studentGpa : Float)  {
                 this.studentGpa = studentGpa
            }
            public fun setStudentLevel (studentLevel : Int)  {
                 this.studentLevel = studentLevel
            }
            public fun setRemindingHours (remindingHours : Int)  {
                 this.remindingHours = remindingHours
            }
            public fun setStudentState (studentState : String)  {
                this.studentState = studentState
            }
            public fun Build () : Student {
                if (this.studentName.isNotEmpty()){
                    return Student(this.studentName,this.studentAge,this.studentSpecialization,this.studentId,this.studentGpa,this.studentLevel,this.remindingHours,this.studentState);
                }else{
                    return throw Exception("Error inter student name !")
                }
            }

        }


}