package com.example.mindfulminutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mindfulminutes.ui.main.MainFragment

class Reminder(s: String, s1: String, s2: String, meditationIcon: Any) {

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reminders = listOf(
            Reminder("Title 1", "March 20, 2023", "10:00 AM", R.drawable.meditation_icon),
            Reminder("Title 2", "March 21, 2023", "3:00 PM", R.drawable.yoga_icon),
            Reminder("Title 3", "March 22, 2023", "5:30 PM", R.drawable.breathing_icon)
        )
        val adapter = ReminderAdapter(reminders)
        reminders_list.adapter = adapter
    }
}

class ReminderAdapter(reminders: List<Reminder>) {

}


 