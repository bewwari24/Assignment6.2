package com.example.assign6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = Toast.makeText(applicationContext,"Some field is blank.", Toast.LENGTH_LONG)
        val Clear = Toast.makeText(applicationContext,"All fields are cleared.",Toast.LENGTH_LONG)
        var Credit:Double
        var Grade:Double
        var GPA:Double

        buttonok.setOnClickListener(){
            if (this.sub1.text.toString() == "" || this.sub2.text.toString() == "" || this.sub3.text.toString() == "" || this.sub4.text.toString() == ""
                    || this.sub5.text.toString() == "" || this.creadit1.text.toString() == "" || this.creadit2.text.toString() == "" || this.creadit3.text.toString() == "" ||
                    this.creadit4.text.toString() == "" || this.creadit5.text.toString() == "" || this.grade1.text.toString() == "" || this.grade2.text.toString() == "" ||
                    this.grade3.text.toString() == "" || this.grade4.text.toString() == "" || this.grade5.text.toString() == ""){
                result.show()
            }else{
                val cred1 = creadit1.getText().toString().toDouble()
                val cred2 = creadit2.getText().toString().toDouble()
                val cred3 = creadit3.getText().toString().toDouble()
                val cred4 = creadit4.getText().toString().toDouble()
                val cred5 = creadit5.getText().toString().toDouble()
                val gra1 = grade1.getText().toString().toDouble()
                val gra2 = grade2.getText().toString().toDouble()
                val gra3 = grade3.getText().toString().toDouble()
                val gra4 = grade4.getText().toString().toDouble()
                val gra5 = grade5.getText().toString().toDouble()
                Credit = cred1 + cred2 + cred3 + cred4 + cred5
                Grade = (gra1 * cred1) + (gra2 * cred2) + (gra3 * cred3) + (gra4 * cred4) + (gra5 * cred5)
                GPA = Grade / Credit
                val gpa2dec = String.format("%.2f", GPA) ;
                Txcredit.setText("$Credit")
                TxGPA.setText("$gpa2dec")
            }
        }
        buttonclear.setOnClickListener(){
            sub1.setText(null)
            sub2.setText(null)
            sub3.setText(null)
            sub4.setText(null)
            sub5.setText(null)
            creadit1.setText(null)
            creadit2.setText(null)
            creadit3.setText(null)
            creadit4.setText(null)
            creadit5.setText(null)
            grade1.setText(null)
            grade2.setText(null)
            grade3.setText(null)
            grade4.setText(null)
            grade5.setText(null)
            Txcredit.setText(null)
            TxGPA.setText(null)
            Clear.show()
        }
    }
}