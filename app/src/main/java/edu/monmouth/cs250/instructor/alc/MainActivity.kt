package edu.monmouth.cs250.instructor.alc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

private val TAG = "ALCMainActivity"
private val MSG_TEXTVIEW_CONTENTS = "ALCMessageTextViewContents"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage (view: View) {
        Log.d(TAG, "Button Pressed")
        val msg = statusMessage.text.toString() + "\n" + message.text + " sent\n"

        statusMessage.setText(msg)
    }

    // LifeCycle Methods

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d(TAG, "onRestoreState")
        super.onRestoreInstanceState(savedInstanceState)
        statusMessage?.setText (savedInstanceState?.getString(MSG_TEXTVIEW_CONTENTS, ""))
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG, "onSaveInstance")
        super.onSaveInstanceState(outState)
        outState?.putString (MSG_TEXTVIEW_CONTENTS, statusMessage.text.toString())
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}
