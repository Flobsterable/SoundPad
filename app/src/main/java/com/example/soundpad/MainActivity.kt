package com.example.soundpad

import android.media.AudioManager
import android.media.MediaPlayer
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soundpad.R.raw.kick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var soundPool : SoundPool = SoundPool(8, AudioManager.STREAM_MUSIC, 0)



        soundPool!!.load(baseContext,R.raw.kick,0)
        soundPool!!.load(baseContext,R.raw.clap,1)
        soundPool!!.load(baseContext,R.raw.snare,2)

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
            soundPool?.play(1,1f,1f,0,0,1f)
        }

        arrayBtn[1].setOnClickListener {
            soundPool?.play(3,1f,1f,0,0,1f)
        }

        arrayBtn[2].setOnClickListener {
            soundPool?.play(2,1f,1f,0,0,1f)
        }

        arrayBtn[3].setOnClickListener {

        }
    }
}