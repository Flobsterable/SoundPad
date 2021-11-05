package com.example.soundpad

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayBtn : Array<Button> = arrayOf(
            findViewById(R.id.button_1),
            findViewById(R.id.button_2),
            findViewById(R.id.button_3),
            findViewById(R.id.button_4)
        )

        val arraySound = arrayOf(
            MediaPlayer.create(this,R.raw.oh_shit_iam_sorry),
            MediaPlayer.create(this,R.raw.stick_your_finger_in_my_ass),
            MediaPlayer.create(this,R.raw.slaves_get_your_ass_back_here),
            MediaPlayer.create(this,R.raw.ds_5)
        )

        arrayBtn[0].setOnClickListener {
            arraySound[0].start()
        }

        arrayBtn[1].setOnClickListener {
            arraySound[1].start()
        }

        arrayBtn[2].setOnClickListener {
            arraySound[2].start()
        }

        arrayBtn[3].setOnClickListener {
            arraySound[3].start()
        }
    }
}