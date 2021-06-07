
package com.appp.yieldcalculation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);//計算開始ボタン
        button.setOnClickListener(new View.OnClickListener() {
            //計算開始ボタンが押されるとダイアログが表示される
            public void onClick(View v) {
                ConfirmDialogFragment dialogFragment = new ConfirmDialogFragment();
                FragmentManager manager = getSupportFragmentManager();
                dialogFragment.show(manager, "MainActivity");
            }
        });


    }

}









