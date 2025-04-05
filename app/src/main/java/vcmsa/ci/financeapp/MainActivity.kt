package vcmsa.ci.financeapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.io.DataInput


class MainActivity : AppCompatActivity() {
    lateinit var input1: DataInput
    lateinit var input2: DataInput
    lateinit var input3: DataInput
    lateinit var input4: DataInput
    lateinit var input5: DataInput
    lateinit var input6: DataInput
    lateinit var input7: DataInput
    lateinit var input8: DataInput
    lateinit var input9: DataInput
    lateinit var display:TextView
    lateinit var button: Button





    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        input1 = findViewById(R.id.etincome)
        input2 = findViewById(R.id.etexpense1)
        input3 = findViewById(R.id.etexpense2)
        input4 = findViewById(R.id.etexpense3)
        input5 = findViewById(R.id.etexpense4)
        input6 = findViewById(R.id.etexpense1)
        input7 = findViewById(R.id.etfigure2)
        input8 = findViewById(R.id.etfigure3)
        input9 = findViewById(R.id.etfigure4)
        display = findViewById(R.id.tvbalance)
        button = findViewById(R.id.btnbalance)

        button.setOnClickListener balance()
        {input1.toString()

        }

        private fun balance()













    }
}