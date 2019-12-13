package info.androidhive.lrtmobile;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

import info.androidhive.lrtmobile.R;

public class daftarstasiun extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] mahasiswa = {"Bandara SMB II","Asrama Haji","Punti Kayu","RSUD","Garuda Dempo","Demang",
            "Bumi Sriwijaya","Dishub","Cinde","Ampera","Polresta","Jakabaring","DJKA"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarstasiun);

        ListView listView = findViewById(R.id.list);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_gaya_baru, data);
        listView.setAdapter(adapter);
    }

    private void getData(){
        //Memasukan Semua Data mahasiswa kedalam ArrayList
        Collections.addAll(data, mahasiswa);
    }


}