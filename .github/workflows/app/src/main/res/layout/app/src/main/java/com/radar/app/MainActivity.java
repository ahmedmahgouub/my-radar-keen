package com.radar.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnKernel, btnKpm, btnStartRadar;
    private boolean isKernelMode = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKernel = findViewById(R.id.btnKernel);
        btnKpm = findViewById(R.id.btnKpm);
        btnStartRadar = findViewById(R.id.btnStartRadar);

        btnKernel.setOnClickListener(v -> {
            isKernelMode = true;
            Toast.makeText(this, "تم اختيار كيرنل مود", Toast.LENGTH_SHORT).show();
        });

        btnKpm.setOnClickListener(v -> {
            isKernelMode = false;
            Toast.makeText(this, "تم اختيار مود KPM", Toast.LENGTH_SHORT).show();
        });

        btnStartRadar.setOnClickListener(v -> {
            Toast.makeText(this, "جاري تشغيل الرادار...", Toast.LENGTH_SHORT).show();
        });
    }
}
