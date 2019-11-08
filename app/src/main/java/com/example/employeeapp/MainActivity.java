package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }

    public void EnterEmployeeInfo(View v)
    {
        TextView firstNameView = this.findViewById(R.id.firstNameView);
        TextView lastNameView = this.findViewById(R.id.lastNameView);
        TextView ageView = this.findViewById(R.id.ageView);
        TextView heightView = this.findViewById(R.id.heightView);
        TextView weightView = this.findViewById(R.id.weightView);

        EditText firstName = this.findViewById(R.id.firstName);
        EditText lastName = this.findViewById(R.id.lastName);
        EditText age = this.findViewById(R.id.age);
        EditText height = this.findViewById(R.id.height);
        EditText weight = this.findViewById(R.id.weight);

        if(TextUtils.isEmpty(firstName.getText().toString())|| TextUtils.isEmpty(lastName.getText().toString()) ||
                TextUtils.isEmpty(age.getText().toString()) || TextUtils.isEmpty(height.getText().toString()) ||
                TextUtils.isEmpty(weight.getText().toString()))
        {
            firstNameView.setText("ERROR");
            lastNameView.setText("INPUT TEXT");
        }
        else
        {
            String firstNameString = firstName.getText().toString();
            String lastNameString = lastName.getText().toString();
            int ageInt = Integer.parseInt(age.getText().toString());
            int heightInt = Integer.parseInt(height.getText().toString());
            int weightInt = Integer.parseInt(weight.getText().toString());
            Employee employee = new Employee(firstNameString,lastNameString,ageInt,heightInt,weightInt);

            firstNameView.setText(employee.firstName + "");
            lastNameView.setText(employee.lastName +"");
            ageView.setText("" + employee.age );
            heightView.setText("" + employee.height);
            weightView.setText("" + employee.weight);

        }
    }
}
