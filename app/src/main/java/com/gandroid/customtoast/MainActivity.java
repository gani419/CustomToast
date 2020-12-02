package com.gandroid.customtoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gandroid.customtoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnCallToast.setOnClickListener(view -> callToast());

    }

    @SuppressLint("SetTextI18n")
    private void callToast() {
        View view = getLayoutInflater().inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_root));
        TextView toastMessage = view.findViewById(R.id.tv_custom_toast);
        toastMessage.setText("Hello from custom toast. Thank you.....");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}