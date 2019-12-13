package info.androidhive.juicecici;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


public class daftarjus extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] mahasiswa = {"Apel","Strawberry","Mangga","Alpukat","Buah Naga","Sirsak",
            "Jambu Biji","Belimbing","Pepaya","Jeruk","Anggur","Pear","Melon","Semangka"};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarjus);

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