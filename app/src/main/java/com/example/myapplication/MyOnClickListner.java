package com.example.myapplication;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyOnClickListner implements View.OnClickListener {

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private TextView ans;


    MyOnClickListner(EditText a, EditText b, EditText c, TextView ans) {
        this.editA = a;
        this.editB = b;
        this.editC = c;
        this.ans = ans;
    }

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(editA.getText().toString());
        int b = Integer.parseInt(editB.getText().toString());
        int c = Integer.parseInt(editC.getText().toString());
        double D = Math.sqrt(b*b-4*a*c);
        if (a==0){
            double x = -c/b;
            ans.setText(x + " ");
        } else {
            if (D == 0) {
                double x1 = -b / (2 * a);
                ans.setText(x1 + " " + x1);
            } else if (D < 0) {
                ans.setText("None");
            } else {
                double x1 = (-b + D) / 2 * a;
                double x2 = (-b - D) / 2 * a;
                ans.setText(x1 + " " + x2);
            }
        }
    }
}
