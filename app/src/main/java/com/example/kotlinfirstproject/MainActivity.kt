package com.example.kotlinfirstproject

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

/*
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinfirstproject.ui.theme.KotlinFirstProjectTheme
*/

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello = findViewById<Button>(R.id.btnHello)
        val txtHello = findViewById<TextView>(R.id.txtHello)
        val edtTxtName = findViewById<EditText>(R.id.edtTxtName)
        btnHello.setOnClickListener{
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            println("Hello")
            txtHello.text = "Hello " + edtTxtName.text.toString()
        }
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinFirstProjectTheme {
        Greeting("Android")
    }
}*/