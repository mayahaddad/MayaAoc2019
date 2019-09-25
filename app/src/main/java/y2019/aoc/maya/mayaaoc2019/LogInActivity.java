package y2019.aoc.maya.mayaaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextEmail, editTextPassword;
    Button buttonLogIn, buttonSignUp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

      buttonLogIn =findViewById(R.id.button);
      buttonLogIn.setOnClickListener(this);
      buttonSignUp = findViewById(R.id.button);
      buttonSignUp.setOnClickListener(this);

    }
    public void onClick(View v){
        if(v==buttonLogIn){
            if(editTextEmail.getText().toString().equals("")||editTextPassword.getText().toString().equals("")){

            }
            else{
                Intent i =new Intent (this, LogInActivity.class);
                i.putExtra("email",editTextEmail.getText().toString());
                startActivity(i);


        }
    }
    else{
            Intent i=new Intent( this,HomePageActivity.class);
            startActivity(i);
        }
}
    }