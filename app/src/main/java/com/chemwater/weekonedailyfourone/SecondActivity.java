package com.chemwater.weekonedailyfourone;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent ;
import android.widget.TextView ;

public class SecondActivity extends Activity {

    public static final String FIRST_NAME = "First Name" ;
    public static final String LAST_NAME = "Last Name" ;
    public static final String ADDRESS = "Address" ;
    public static final String CITY = "City" ;
    public static final String STATE = "State" ;
    public static final String POSTAL_CODE = "Postal Code" ;


    TextView tvFirstNameSecond ;
    TextView tvLastNameSecond ;
    TextView tvAddressSecond ;
    TextView tvCitySecond ;
    TextView tvStateSecond ;
    TextView tvPostalCodeSecond ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent retrievedInfo = getIntent() ;
        String firstNameFromMain = retrievedInfo.getStringExtra(FIRST_NAME) ;
        String lastNameFromMain = retrievedInfo.getStringExtra(LAST_NAME) ;
        String addressFromMain = retrievedInfo.getStringExtra(ADDRESS) ;
        String cityFromMain = retrievedInfo.getStringExtra(CITY) ;
        String stateFromMain = retrievedInfo.getStringExtra(STATE) ;
        String postalCodeFromMain = retrievedInfo.getStringExtra(POSTAL_CODE) ;


        tvFirstNameSecond = (TextView) findViewById(R.id.tvFirstName) ;
        tvLastNameSecond = (TextView) findViewById(R.id.tvLastName) ;
        tvAddressSecond = (TextView) findViewById(R.id.tvAddress) ;
        tvCitySecond = (TextView) findViewById(R.id.tvCity) ;
        tvStateSecond = (TextView) findViewById(R.id.tvState) ;
        tvPostalCodeSecond = (TextView) findViewById(R.id.tvPostalCode) ;

        tvFirstNameSecond.setText(firstNameFromMain) ;
        tvLastNameSecond.setText(lastNameFromMain) ;
        tvAddressSecond.setText(addressFromMain) ;
        tvCitySecond.setText(cityFromMain) ;
        tvStateSecond.setText(stateFromMain) ;
        tvPostalCodeSecond.setText(postalCodeFromMain) ;





    }
}
