/*  Custom Toast in App Development.

    Date:29 August,2023
    Author:Hasibur Rahman(13/21|CSE-02)

*/

package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButtonId);

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                LayoutInflater inflater = getLayoutInflater();
                View customView = inflater.inflate(R.layout.customtoast_layout,(ViewGroup) findViewById(R.id.customtoast_Id));

                Toast toast = new Toast(MainActivity.this);

                toast.setGravity(Gravity.NO_GRAVITY,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(customView);
                toast.show();
            }
        });
    }
}