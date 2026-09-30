package com.example.sendmessage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.content.Intent
import android.util.Log
/**
 * Activity encargada de permitir al usuario introducir un mensaje
 * y enviarlo a ViewActivity.
 */
class SendActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "SendActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)
        Log.d(TAG, "onCreate")
        val edtMensaje = findViewById<EditText>(R.id.edtMensaje)
        val btnSend = findViewById<Button>(R.id.btnSend)
        btnSend.setOnClickListener {

            val mensaje = edtMensaje.text.toString()

            val intent = Intent(this, ViewActivity::class.java)

            intent.putExtra("mensaje", mensaje)

            startActivity(intent)
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}