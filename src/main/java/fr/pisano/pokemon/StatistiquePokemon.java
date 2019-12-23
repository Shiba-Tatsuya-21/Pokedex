package fr.pisano.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StatistiquePokemon extends AppCompatActivity {

    private int HP;
    private int Attack;
    private int Defense;
    private int SpAttack;
    private int SpDefense;
    private int Speed;
    private String[] Type;
    private String nom;

    private TextView nomPoke;
    private TextView TypePoke;
    private TextView HpPoke;
    private TextView AttaquePoke;
    private TextView DefensePoke;
    private TextView AttaqueSpePoke;
    private TextView DefenseSpePoke;
    private TextView SpeedPoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistique_pokemon);
        Intent intent = getIntent();
        HP = intent.getIntExtra("Vie", 0);
        Attack = intent.getIntExtra("Attaque", 0);
        Defense = intent.getIntExtra("Defense",0);
        SpAttack = intent.getIntExtra("Attaque_spe",0);
        SpDefense = intent.getIntExtra("Defense_spe",0);
        Speed = intent.getIntExtra("Vitesse",0);
        nom = intent.getStringExtra("nom");
        Type = intent.getStringArrayExtra("Type");

        nomPoke = findViewById(R.id.name);
        TypePoke = findViewById(R.id.Type);
        HpPoke = findViewById(R.id.Hp);
        AttaquePoke = findViewById(R.id.Attaque);
        DefensePoke = findViewById(R.id.Defense);
        DefenseSpePoke = findViewById(R.id.DefenseSpe);
        AttaqueSpePoke = findViewById(R.id.AttauqeSpe);
        SpeedPoke = findViewById(R.id.Speed);

        String typeFinal = "";
        for(int i = 0 ; i < Type.length ; i++){
            if(i==Type.length - 1){
                typeFinal += Type[i] + " ";
            }
            else {
                typeFinal += Type[i] +", ";
            }
        }



        nomPoke.setText(" Nom du pokemon : \n" + nom);
        TypePoke.setText("Type : " + typeFinal);
        HpPoke.setText("Vie : " + Integer.toString(HP));
        AttaquePoke.setText("Attaque : " + Integer.toString(Attack));
        DefensePoke.setText("Defense : " + Integer.toString(Defense));
        AttaqueSpePoke.setText("Attaque Spéciale : " + Integer.toString(SpAttack));
        DefenseSpePoke.setText("Defense Spéciale : " + Integer.toString(SpDefense));
        SpeedPoke.setText("Vitesse : " + Integer.toString(Speed));

    }
}
