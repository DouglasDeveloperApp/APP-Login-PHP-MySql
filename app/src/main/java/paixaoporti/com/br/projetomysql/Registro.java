package paixaoporti.com.br.projetomysql;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class Registro extends AppCompatActivity {

    EditText ET_NAME, ET_USER_NAME, ET_USER_PASS;
    String name, user_name, user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ET_NAME = (EditText)findViewById(R.id.name);
        ET_USER_NAME = (EditText)findViewById(R.id.new_user_name);
        ET_USER_PASS = (EditText)findViewById(R.id.new_user_pass);

    }

    public void userReg(View view){
        name = ET_NAME.getText().toString();
        user_name = ET_USER_NAME.getText().toString();
        user_pass = ET_USER_PASS.getText().toString();

        String method = "Registro";


        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, name, user_name, user_pass);

        finish ();

    }

}
