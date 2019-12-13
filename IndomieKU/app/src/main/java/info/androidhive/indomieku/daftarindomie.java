package info.androidhive.indomieku;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


public class daftarindomie extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] mahasiswa = {"Sambal Matah","Sambal Ijo","Rendang","Ayam  Geprek","Ayam Penyet",
            "Telur","Extra Pedas","Komplit","Beef","Bakso","Soto","Ayam Bawang","Kari Ayam"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarindomie);

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