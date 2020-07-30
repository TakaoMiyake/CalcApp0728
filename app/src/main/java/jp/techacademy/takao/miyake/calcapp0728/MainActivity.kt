
package jp.techacademy.takao.miyake.calcapp0728

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log



class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus_button.setOnClickListener(this)
        minus_button.setOnClickListener(this)
        mul_button.setOnClickListener(this)
        div_button.setOnClickListener(this)

    }

    override fun onClick(v:View?){
        val intent= Intent(this, SecondActivity::class.java)

        var num_Edit1:Double =0.0
        var num_Edit2:Double = 0.0
        var result_num:Double =0.0

       /*do{
            num_Edit1 = editText1.text.toString().toDouble()
        }while(editText1.text.toString().toDouble()==null)

        do{
            num_Edit2 = editText2.text.toString().toDouble()
        }while(editText2.text.toString().toDouble()==null)

        if( editText1 != null ){
            num_Edit1 = editText1.text.toString().toDouble()
        }else{

        }

        if( editText2.text.toString() != null ){
            num_Edit2 = editText2.text.toString().toDouble()
        }else{

        }*/

        if ((v != null && editText1.text != null )|| (v != null && editText2.text != null )){
            if(v.id  == R.id.plus_button){
                result_num = num_Edit1 + num_Edit2
                intent.putExtra("VALUE1", num_Edit1)
                intent.putExtra("VALUE2", num_Edit2)
                intent.putExtra("VALUE3", "＋")
                intent.putExtra("VALUE4",result_num)
            }else if(v.id== R.id.minus_button){
                result_num = num_Edit1 - num_Edit2
                intent.putExtra("VALUE1", num_Edit1)
                intent.putExtra("VALUE2", num_Edit2)
                intent.putExtra("VALUE3", "－")
                intent.putExtra("VALUE4",result_num)
            }else if(v.id == R.id.mul_button){
                result_num = num_Edit1 * num_Edit2
                intent.putExtra("VALUE1", num_Edit1)
                intent.putExtra("VALUE2", num_Edit2)
                intent.putExtra("VALUE3", "×")
                intent.putExtra("VALUE4",result_num)
            }else if(v.id == R.id.div_button) {
                result_num = num_Edit1 / num_Edit2
                intent.putExtra("VALUE1", num_Edit1)
                intent.putExtra("VALUE2", num_Edit2)
                intent.putExtra("VALUE3", "÷")
                intent.putExtra("VALUE4",result_num)
            }
        }

        startActivity(intent)
    }

}
