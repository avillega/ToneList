package it.save.tonelist.control;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import it.save.tonelist.R;

public class Rol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rol);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void dj(View v){
        startActivity(new Intent(getApplicationContext(),MisFiestas.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
    }

    public void espectador(View v){
        startActivity(new Intent(getApplicationContext(), LeerQr.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
    }


    @Override
    public void onBackPressed() {
        return;
    }
}
