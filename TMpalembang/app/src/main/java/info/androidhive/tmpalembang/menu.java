package info.androidhive.tmpalembang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void btnjudulbuku(View view) {
        Intent i1= new Intent(getApplicationContext(),jalurtm.class);
        startActivity(i1);
    }
    public void btnpinjambuku(View view) {
        Intent i1= new Intent(getApplicationContext(),tikettm.class);
        startActivity(i1);
    }
}
