package info.androidhive.tmpalembang;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


public class jalurtm extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] mahasiswa = {"Sako-Pim","Km12-Plaju","Pusri-PS Mall","Km12-Kertapati","Km12-Ampera"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jalurtm);

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