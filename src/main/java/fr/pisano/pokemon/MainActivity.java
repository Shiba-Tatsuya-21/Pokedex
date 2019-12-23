package fr.pisano.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Gson gson = new Gson();
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokemons = buildPokemonsList();
        Log.i("name :", pokemons.get(0).toString());
        ListView pokemonList = (ListView) findViewById(R.id.pokemon_list);
        pokemonList.setAdapter(new PokemonAdapter(getApplicationContext(), pokemons));
        pokemonList.setOnItemClickListener(adaptateurListener);
    }

    private ArrayList<Pokemon> buildPokemonsList() {
        Type listType = new TypeToken<ArrayList<Pokemon>>() {
        }.getType();
        return gson.fromJson(readJSONFile("pokedex.json"), listType);
    }

    private String readJSONFile(String filename) {
        AssetManager am = this.getAssets();
        String result = "";
        try {
            InputStream inputStream = am.open(filename);
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            result = new String(b);
        } catch (Exception e) {
            Log.e("Error readJSONFile", e.getMessage());
        }   // Log.i("Result",result);
        return result;
    }

    private AdapterView.OnItemClickListener adaptateurListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getApplication(), StatistiquePokemon.class);
            intent.putExtra("Type", pokemons.get(position).getType());
            intent.putExtra("Vie", pokemons.get(position).getBase().getHP());
            intent.putExtra("Attaque", pokemons.get(position).getBase().getAttack());
            intent.putExtra("Defense", pokemons.get(position).getBase().getDefense());
            intent.putExtra("Defense_spe", pokemons.get(position).getBase().getSpDefense());
            intent.putExtra("Attaque_spe", pokemons.get(position).getBase().getSpAttack());
            intent.putExtra("Vitesse", pokemons.get(position).getBase().getSpeed());
            intent.putExtra("nom", pokemons.get(position).getName().toString());
            startActivity(intent);
        }
    };
}
