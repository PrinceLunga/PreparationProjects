package com.prince.ssrinitial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import DataHandlers.StudentsDbHandler;

public class MainActivity extends AppCompatActivity {

    TextView idView;
    EditText fullname;
    EditText username;
    EditText homeaddress;
    EditText email;
    EditText cellnumber;
    EditText dateofbirth;
    EditText datemodified;
    EditText datecreated;
    EditText enddate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idView = findViewById(R.id.lblId);
        fullname = findViewById(R.id.txtFULLNAME);
        username = findViewById(R.id.txtUSERNAME);
        homeaddress = findViewById(R.id.txtHOMEADDRESS);
        email = findViewById(R.id.txtEMAILADDRESS);
        cellnumber = findViewById(R.id.txtCELLNUMBER);
        dateofbirth = findViewById(R.id.txtDATEOFBIRTH);
        datemodified = findViewById(R.id.txtDATEMODIFIED);
        datecreated = findViewById(R.id.txtDATECREATED);
        enddate = findViewById(R.id.txtENDDATE);
    }

    //Add a new student record to the database
    public void add_student(View view)
    {
        StudentsDbHandler dbHandler = new StudentsDbHandler(this, null, null, 1);
        Models.Student student = new Models.Student(fullname.getText().toString(), username.getText().toString(), homeaddress.getText().toString(),            email.getText().toString(), cellnumber.getText().toString(), dateofbirth.getText().toString(),
                datemodified.getText().toString(), datecreated.getText().toString(), enddate.getText().toString());
        dbHandler.addStudent(student);
        if (student != null) {
            fullname.setText("");
            username.setText("");
            homeaddress.setText("");
            email.setText("");
            cellnumber.setText("");
            dateofbirth.setText("");
            datemodified.setText("");
            datecreated.setText("");
            enddate.setText("");
            Toast.makeText(this, "Student Successfully Added !", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Failed to add a student ", Toast.LENGTH_LONG).show();
        }
    }

    // Find a student record from the database
    public void find_student (View view)
    {
        StudentsDbHandler dbHandler = new StudentsDbHandler(this, null, null, 1);
        Models.Student student = dbHandler.findStudent(fullname.getText().toString());
        if (student != null)
        {
            idView.setText(String.valueOf(student.getStudentId()));
            fullname.setText(student.getFullname());
            email.setText(student.getEmail());
            username.setText(student.getUserName());
            homeaddress.setText(student.getHomeAddress());
            cellnumber.setText(student.getCellNumber());
            dateofbirth.setText(student.getDateOfBirth());
            datecreated.setText(student.getDateCreated());
            datemodified.setText(student.getDateModified());
            enddate.setText(student.getEndDate());
        }
        else
        {
            idView.setText("No Match Found");
        }
    }

    public void removeProduct (View view)
    {
        StudentsDbHandler dbHandler = new StudentsDbHandler(this, null, null, 1);
        boolean result = dbHandler.deleteStudent( username.getText().toString());
        if (result) { idView.setText("Record Deleted");
            fullname.setText("");
            username.setText("");
            homeaddress.setText("");
            email.setText("");
            cellnumber.setText("");
            dateofbirth.setText("");
            datemodified.setText("");
            datecreated.setText("");
            enddate.setText("");
        }
        else
        {
            idView.setText("No Match Found");
        }
    }
}
