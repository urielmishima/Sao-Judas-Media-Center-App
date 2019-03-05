package com.anima.usjt.saojudasmediacenter.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anima.usjt.saojudasmediacenter.R;

public class EstagiarioMenuActivity extends AppCompatActivity {

    private Button confeccaoConteudoButtonEstagiarioMenuActivity;
    private Button uploadMaterialBrutoButtonEstagiarioMenuActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estagiario_menu);

        confeccaoConteudoButtonEstagiarioMenuActivity = findViewById(R.id.confeccaoConteudoButtonEstagiarioMenuActivity);
        uploadMaterialBrutoButtonEstagiarioMenuActivity = findViewById(R.id.uploadMaterialBrutoButtonEstagiarioMenuActivity);

        uploadMaterialBrutoButtonEstagiarioMenuActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EstagiarioMenuActivity.this, EstagiarioUploadMaterialBrutoActivity.class);
                startActivity(intent);
            }
        });
    }
}
