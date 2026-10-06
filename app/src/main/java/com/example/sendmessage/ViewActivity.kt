package com.example.sendmessage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.util.Log
import com.example.sendmessage.model.Message
/**
 * Activity encargada de recibir y mostrar el mensaje
 * enviado desde SendActivity.
 */
class ViewActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "ViewActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view)
        Log.d(TAG, "onCreate")
        val txtRemitenteRecibido = findViewById<TextView>(R.id.txtRemitenteRecibido)
        val txtMensajeRecibido = findViewById<TextView>(R.id.txtMensajeRecibido)

        @Suppress("DEPRECATION")
        val mensaje = intent.getSerializableExtra(SendActivity.EXTRA_MESSAGE) as? Message

        txtRemitenteRecibido.text = mensaje?.sender?.name?.let {
            "De: $it"
        } ?: ""

        txtMensajeRecibido.text = mensaje?.text ?: ""
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