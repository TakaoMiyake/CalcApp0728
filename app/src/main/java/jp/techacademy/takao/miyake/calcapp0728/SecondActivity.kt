package jp.techacademy.takao.miyake.calcapp0728

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var value1 = intent.getDoubleExtra("VALUE1",0.0)
        var value2 = intent.getDoubleExtra("VALUE2",0.0)
        var operand_Char = intent.getStringExtra("VALUE3")
        var value4 = intent.getDoubleExtra("VALUE4",0.0)

        Log.d("ANDROID", value1.toString())

        textView4.text = " ${value1} ${operand_Char} ${value2} ＝ ${value4}"

    }
}
