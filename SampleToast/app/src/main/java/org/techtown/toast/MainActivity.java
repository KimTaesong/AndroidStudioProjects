package org.techtown.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast2();
            }
        });

    }

    public void showToast() {
        Toast toast = Toast.makeText(this,"메시지입니다.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,200, 800);
        toast.show();
    }

    public void showToast2() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toastborder, (ViewGroup) findViewById(R.id.toast_layout_root));

        TextView text = layout.findViewById(R.id.text);
        text.setText("모양 바꾼 토스트");

        Toast toast = new Toast(this);
        toast.setGravity(Gravity.CENTER, 0 , -100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }
}
