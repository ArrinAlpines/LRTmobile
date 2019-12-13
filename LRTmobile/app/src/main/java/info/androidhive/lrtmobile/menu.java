package info.androidhive.lrtmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btnstasiun(View view) {
        Intent i1 = new Intent(getApplicationContext(), daftarstasiun.class);
        startActivity(i1);
    }
    public void btnjadwal(View view) {
        Intent i1 = new Intent(getApplicationContext(), jadwallrt.class);
        startActivity(i1);
    }
    public void btnpesan(View view) {
        Intent i1 = new Intent(getApplicationContext(), pesantiket.class);
        startActivity(i1);
    }
    public void btninfo(View view){
        Intent i1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i1);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://lrtpalembang.com/"));
        startActivity(intent);
    }
}
