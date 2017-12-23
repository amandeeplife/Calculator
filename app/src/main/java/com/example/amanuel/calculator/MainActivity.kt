package com.example.amanuel.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var result=""
    var pmcheck=true;
var old=0f
    var op=""
     var current:Float=0f
    var isNewOp=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
fun ButtonEvent(view: View){

    isNewOp=false
    var btn:Button=view as Button


    when(btn.id){
       id0.id->{
           result+="0"
        }
        id1.id->{
            result+="1"
        }

        id2.id->{
            result+="2"
        }
        id3.id->{
            result+="3"
        }
        id44.id->{
            result+="4"
        }
        id55.id->{
            result+="5"
        }

        id66.id->{
            result+="6"
        }
        id7.id->{
            result+="7"
        }

        id8.id->{
            result+="8"
        }
        id9.id->{
            result+="9"
        }
        idpoint.id->{
            result+="."
        }
        idAC.id->{
          idresult.setText("0")
 result=""
        }
idplusorminus.id->{
    if(pmcheck){
       pmcheck=false
    }
    result+="-"

}
    }
    idresult.setText(result)


}

    fun ButtonOperation(view:View) {
    old=idresult.text.toString().toFloat()
        if(!isNewOp){
            idresult.setText("")
          // result=""
        }


        var button: Button = view as Button
         when(button.id){

            iddivide.id->{
                idresult.setText(result+"/")
                op="divide"}
             idplus.id->{
                 idresult.setText(result+"+")
                 op="plus"}
             idmultiply.id->{
                 idresult.setText(result+"*")
                 op="multiply"}
             idminus.id->{
                 idresult.setText(result+"-")
                 op="minus"}
             idpercent.id->{
                 idresult.setText(result+"%")
                 op="module"}

        }

        if(!isNewOp){
                result=""
        }
    }
fun Compute(view:View){
   var current1:Float=idresult.text.toString().toFloat()
var finalResult=""
     var button: Button = view as Button
    when(op){
        "divide"->{
            current=old/current1;
            finalResult=current.toString()
            if(finalResult.length>6){
                idresult.setTextSize(50f)
            }
            idresult.setText(current.toString())
        }
        "plus"->{
            current=old+current1;
            idresult.setText(current.toString())
        }
        "module"->{
            current=old%current1;
            idresult.setText(current.toString())
        }
        "minus"->{
            current=old-current1;
            idresult.setText(current.toString())
        }
        "multiply"->{
            current=old*current1;
            idresult.setText(current.toString())
        }
    }
}

}
