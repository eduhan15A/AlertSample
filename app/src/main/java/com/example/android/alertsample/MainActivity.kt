package com.example.android.alertsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast
import android.content.DialogInterface



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowAlert(view: View){
        val myAlertBuilder = AlertDialog.Builder(this@MainActivity)
        // Set the dialog title.
        myAlertBuilder.setTitle(getString(R.string.alert_title));
        // Set the dialog message.
        myAlertBuilder.setMessage(getString(R.string.alert_message));

        // Add the buttons.
        myAlertBuilder.setPositiveButton(getString(R.string.ok)) { dialog, which ->
            // User clicked OK button.
            Toast.makeText(applicationContext, getString(R.string.pressed_ok),
                    Toast.LENGTH_SHORT).show()
        }
        myAlertBuilder.setNegativeButton(getString(R.string.cancel)) { dialog, which ->
            // User cancelled the dialog.
            Toast.makeText(applicationContext, getString(R.string.pressed_cancel),
                    Toast.LENGTH_SHORT).show()
        }

        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }

}
