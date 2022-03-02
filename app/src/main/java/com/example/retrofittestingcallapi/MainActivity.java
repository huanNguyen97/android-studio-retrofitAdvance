package com.example.retrofittestingcallapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.retrofittestingcallapi.api.ApiService;
import com.example.retrofittestingcallapi.model.Result;
import com.example.retrofittestingcallapi.model.Results;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView_show);
        button = findViewById(R.id.btn_show);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callApiOk();
            }
        });
    }

    private void callApiOk() {
        ApiService.apiService.ReadList()
            .enqueue(new Callback<Results>() {
                @Override
                public void onResponse(Call<Results> call, Response<Results> response) {
                    Results rs = response.body();

                    for (Result r : rs.getResult()) {
                        textView.setText(r.getUser().getLocation().getStreet());
                    }
                }

                @Override
                public void onFailure(Call<Results> call, Throwable t) {

                }
            });
    }
}