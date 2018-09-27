package com.example.spericorn.retrofit2_testapp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button button;
    private static final String TAG = MainActivity.class.getSimpleName();
    ProgressDialog pgBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        try {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getting_data();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //TODO:we need to call this.
    private void getting_data() {
//        pgBar = Progress_class.createProgressDialog(getApplicationContext());
//        pgBar.show();
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<ModelResponse> call = apiService.getmachine_test2();
        call.enqueue(new Callback<ModelResponse>() {
            @Override
            public void onResponse(Call<ModelResponse> call, Response<ModelResponse> response) {
//                if (pgBar.isShowing()) {
//                    pgBar.dismiss();
//                }

                ModelResponse modelResponse = response.body();
                Log.e("modelresponse:", modelResponse + "");
            }

            @Override
            public void onFailure(Call<ModelResponse> call, Throwable t) {
//                if (pgBar.isShowing()) {
//                    pgBar.dismiss();
//                }
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}
