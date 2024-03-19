package com.example.exerccio
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btEntrar: Button = findViewById<Button>(R.id.btEntrar)

        btEntrar.setOnClickListener{
            val etUsuario = findViewById<EditText>(R.id.Usuario)
            val etSenha = findViewById<EditText>(R.id.editTextTextPassword)

            if(etUsuario.text.toString() != "" && etSenha.text.toString() != "")
            {
                val sysUser = "admin"
                val sysSenha = "123456"


                if(etSenha.text.toString() == sysSenha)
                {
                    Toast.makeText(this, "Seja bem vindo" + etUsuario.text, Toast.LENGTH_LONG).show()
                }
                else
                {
                    Toast.makeText(this, "Usuario ou senha invalidos", Toast.LENGTH_LONG).show()
                }
            }
            else {
                Toast.makeText(this, "digite o usuario e senha", Toast.LENGTH_LONG).show()
            }

            val btCadastrar: Button = findViewById<Button>(R.id.btCadastrar)

            btCadastrar.setOnClickListener()
            {
                Toast.makeText(this, "digite o usuario e senha", Toast.LENGTH_LONG).show()
        }

        }

    }

}