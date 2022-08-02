package com.example.motion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val success = findViewById<Button>(R.id.success)
        val error = findViewById<Button>(R.id.error)
        val warning = findViewById<Button>(R.id.warning)
        val info = findViewById<Button>(R.id.info)


        success.setOnClickListener {
            MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular))

        }

        error.setOnClickListener {
            MotionToast.createToast(this,
                "Failed ☹",
                "Profile Update Failed!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular))
        }

        warning.setOnClickListener {
            MotionToast.createToast(this,
                "Warning",
                "Please fill all the details!",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular))
        }

        info.setOnClickListener {
            MotionToast.createToast(this,
                "This is information toast!",
                "Upload Completed successfully!",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular))
        }
    }
}