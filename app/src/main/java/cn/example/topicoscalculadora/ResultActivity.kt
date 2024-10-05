package cn.example.topicoscalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var nombreMat : TextView = findViewById(R.id.materia)
        var horasTeo : TextView = findViewById(R.id.horasTeoricas)
        var horasPrac : TextView = findViewById(R.id.horasPracticas)
        var trabajoInd : TextView = findViewById(R.id.trabajoIndependiente)
        var credito : TextView = findViewById(R.id.creditos)

        val buttonReturn = findViewById<Button>(R.id.button2)
        buttonReturn.setOnClickListener({finish()})
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.result)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left,systemBars.top,systemBars.right,systemBars.bottom)
            insets
        }

        var nombreMate : String = intent.extras?.getString("nombreMat").orEmpty()
        var horasTeor : String = intent.extras?.getString("horaTeo").orEmpty()
        var horasPract : String = intent.extras?.getString("horaPrac").orEmpty()
        var trabajoIndp : String = intent.extras?.getString("trabajoInd").orEmpty()
        var creditos : String = intent.extras?.getString("numeroCreditos").orEmpty()

        nombreMat.text = nombreMate
        horasTeo.text = horasTeor
        horasPrac.text = horasPract
        trabajoInd.text = trabajoIndp
        credito.text = creditos

    }
}