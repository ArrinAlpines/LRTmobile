package info.androidhive.juicecici;

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

    public void btnmenujus(View view) {
        Intent i1 = new Intent(getApplicationContext(), daftarjus.class);
        startActivity(i1);
    }
    public void btnorder(View view) {
        Intent i1 = new Intent(getApplicationContext(), order.class);
        startActivity(i1);
    }

}
