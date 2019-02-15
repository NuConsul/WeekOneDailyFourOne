package com.chemwater.weekonedailyfourone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View ;
import android.content.Intent ;
import android.widget.EditText ;
import android.widget.Button ;


public class MainActivity extends Activity {

    EditText etFirstNameMain ;
    EditText etSecondNameMain ;
    EditText etAddressMain ;
    EditText etCityMain ;
    EditText etStateMain ;
    EditText etPostCodeMain ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etFirstNameMain = (EditText) findViewById(R.id.etFirstName) ;
        etSecondNameMain = (EditText) findViewById(R.id.etLastName) ;
        etAddressMain = (EditText) findViewById(R.id.address) ;
        etCityMain = (EditText) findViewById(R.id.city) ;
        etStateMain = (EditText) findViewById(R.id.state) ;
        etPostCodeMain = (EditText) findViewById(R.id.postal_code) ;
    }


    public void onClickSendData(View view) {


        Intent intent = new Intent(this, SecondActivity.class) ;
        String firstName = etFirstNameMain.getText() != null ? etFirstNameMain.getText().toString() : "" ;
        String lastName = etSecondNameMain.getText() != null ? etSecondNameMain.getText().toString() : "" ;
        String address = etAddressMain.getText() != null ? etAddressMain.getText().toString() : "" ;
        String city = etCityMain.getText() != null ? etCityMain.getText().toString() : "" ;
        String state = etStateMain.getText() != null ? etStateMain.getText().toString() : "" ;
        String postalCode = etPostCodeMain.getText() != null ? etPostCodeMain.getText().toString() : "" ;



        intent.putExtra(SecondActivity.FIRST_NAME, firstName) ;
        intent.putExtra(SecondActivity.LAST_NAME, lastName) ;
        intent.putExtra(SecondActivity.ADDRESS, address) ;
        intent.putExtra(SecondActivity.CITY, city) ;
        intent.putExtra(SecondActivity.STATE, state) ;
        intent.putExtra(SecondActivity.POSTAL_CODE, postalCode) ;


        startActivity(intent) ;
    }



}



/*
import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.text.Editable;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView ;
        import android.text.TextWatcher ;
        import android.widget.Toast;

public class MainActivity extends Activity implements TextWatcher, View.OnClickListener, View.OnLongClickListener {

    public static final String CLEAR_STRING = "" ;

    Intent secondActivityIntent = new Intent(this, SecondActivity.class) ;

    TextView tvFirstName ;
    TextView tvLastName ;
    EditText etFirstName ;
    EditText etLastName ;
    Button btnDisplayName ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFirstName = (TextView) findViewById(R.id.tvFirstNameDisplay) ;
        tvLastName = (TextView) findViewById(R.id.tvSecondNameDisplay) ;
        etFirstName = (EditText) findViewById(R.id.etFirstNameInput) ;
        etLastName = (EditText) findViewById(R.id.etSecondNameInput) ;
        btnDisplayName = findViewById(R.id.btnSendName) ;

        etFirstName.addTextChangedListener(this) ;
        btnDisplayName.setOnLongClickListener(this) ;

        //btnDisplayName.setOnClickListener(this) ;

    }

    public void onClickSendName(View view) {

        switch(view.getId()) {
            case R.id.btnSendName:

                String firstName = etFirstName.getText() != null ? etFirstName.getText().toString() : CLEAR_STRING ;
                String lastName = etLastName.getText() != null ? etLastName.getText().toString() : CLEAR_STRING ;
                tvFirstName.setText(firstName) ;
                tvLastName.setText(lastName) ;

                break ;

            case R.id.btnClearName:

                tvFirstName.setText(CLEAR_STRING) ;
                tvLastName.setText(CLEAR_STRING) ;
                /////Intent secondActivityIntent = new Intent(this, SecondActivity.class) ;
                ////startActivity(secondActivityIntent) ;
                ///startActivityForResult(secondActivityIntent,  666) ;
                startActivity(secondActivityIntent) ;

                break ;
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data) ;
    }


    // @Override
    //public void onClick(View v) {

    //}


    //@Override
    public void onClick(View view) {

    }


    //@Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    //@Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    //@Override
    public void afterTextChanged(Editable s) {
        Toast.makeText(this, "String Length = " + s.toString().length(), Toast.LENGTH_LONG).show() ;
    }

    //@Override
    public boolean onLongClick(View view) {
        Toast.makeText(this, "LONG CLICK", Toast.LENGTH_SHORT).show() ;
        return false;
    }
}
*/