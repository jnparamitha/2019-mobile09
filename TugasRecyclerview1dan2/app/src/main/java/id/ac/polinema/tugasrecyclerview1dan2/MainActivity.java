package id.ac.polinema.tugasrecyclerview1dan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.tugasrecyclerview1dan2.adapters.KatalogBajuAdapter;
import id.ac.polinema.tugasrecyclerview1dan2.models.KatalogBaju;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvKatalogBaju;
    List<KatalogBaju> bajuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvKatalogBaju = findViewById(R.id.rvKatalogBaju);

        KatalogBaju katalogBaju = new KatalogBaju("Women 1", "Warna Baju : Cream", "Ukuran Tersedia : S,M,L", R.drawable.baju1);
        bajuList.add(katalogBaju);

        katalogBaju = new KatalogBaju("Women 2", "Warna Baju : Tosca", "Ukuran Tersedia : M,L", R.drawable.baju2);
        bajuList.add(katalogBaju);

        katalogBaju = new KatalogBaju("Women 3", "Warna Baju : Jeans", "Ukuran Tersedia : XS,S,M,L", R.drawable.baju4);
        bajuList.add(katalogBaju);

        katalogBaju = new KatalogBaju("Men 1", "Warna Baju : Biru Muda", "Ukuran Tersedia : S,M,L,XL", R.drawable.men2);
        bajuList.add(katalogBaju);

        katalogBaju = new KatalogBaju("Men 2", "Warna Baju : Navy", "Ukuran Tersedia : S,L", R.drawable.men3);
        bajuList.add(katalogBaju);

        katalogBaju = new KatalogBaju("Men 3", "Warna Baju : Red", "Ukuran Tersedia : S,M,L,XL,XXL", R.drawable.men4);
        bajuList.add(katalogBaju);

        KatalogBajuAdapter katalogBajuAdapter = new KatalogBajuAdapter(bajuList);
        rvKatalogBaju.setAdapter(katalogBajuAdapter);
        rvKatalogBaju.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        rvKatalogBaju.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
