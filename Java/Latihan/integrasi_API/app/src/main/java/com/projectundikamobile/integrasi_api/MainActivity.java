package com.projectundikamobile.integrasi_api;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    //Fadil 1941010076
    private ProgressDialog progressDialog;
    private TextView tvShow;
    private Button btnRefresh;

    protected String apiurl = "https://api.kawalcorona.com/indonesia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        klik();
        getDataHome();
    }

    private void getDataHome() {

        getHomeAsyncTask getHomeAsyncTask = new getHomeAsyncTask();
        getHomeAsyncTask.execute();


    }

    public void init(){

        btnRefresh = (Button) findViewById(R.id.btnRefresh);
        tvShow = (TextView) findViewById(R.id.api);

    }

    private void klik() {

        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getDataHome();

            }
        });

    }

    public class getHomeAsyncTask extends AsyncTask <String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = new ProgressDialog( MainActivity.this);
            progressDialog.setMessage("Please Wait..");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... strings) {

            String current = "";

            try {

                URL url;
                HttpURLConnection urlConnection = null;

                try {

                    url = new URL(apiurl);
                    urlConnection = (HttpURLConnection) url.openConnection();

                    InputStream inputStream = urlConnection.getInputStream();
                    InputStreamReader isw = new InputStreamReader(inputStream);

                    int data = isw.read();

                    while (data != -1) {

                        current += (char) data;
                        data = isw.read();

                    }

                    return current;

                } catch (Exception e) {

                    e.printStackTrace();


                } finally {

                    if (urlConnection != null) {
                        urlConnection.disconnect();
                    }

                }

            }catch (Exception e) {

                e.printStackTrace();

                return "Exception " + e.getMessage();
            }

            return current;
        }

        @Override
        protected void onPostExecute(String s) {
            progressDialog.dismiss();

            try {

                JSONArray jsonArray = new JSONArray(s);
                JSONObject object = jsonArray.getJSONObject(0);
                String showData = "Nama Negara : " + object.getString("name");

                tvShow.setText(showData);

            } catch (Exception e) {

                e.printStackTrace();

            }

        }
    }

}