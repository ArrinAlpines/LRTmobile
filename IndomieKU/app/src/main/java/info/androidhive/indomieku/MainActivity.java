package info.androidhive.indomieku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnmasuk (View view){
        Intent i1 = new Intent(getApplicationContext(), menu.class);
        startActivity(i1);
    }
}
