package com.mirea.bykonyaia.buttonclicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textLabel = null;
    private Button whoAmIButton = null;
    private Button itsNotMeButton = null;
    private CheckBox stateCheckBox = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textLabel = findViewById(R.id.textLabel);
        whoAmIButton = findViewById(R.id.whoAmI);
        itsNotMeButton = findViewById(R.id.itsNotMe);
        stateCheckBox = findViewById(R.id.stateCheckBox);
        whoAmIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View var1)  {
                textLabel.setText("Мой номер по списку: ну, вроде бы 5-й...");
                stateCheckBox.setChecked(false);
            }
        });
    }

    public void onItsNotMeButtonClicked(View view) {
        textLabel.setText("Это не я сделал...");
        stateCheckBox.setChecked(true);
    }
}