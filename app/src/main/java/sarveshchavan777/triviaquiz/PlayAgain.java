package sarveshchavan777.triviaquiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PlayAgain extends Activity {

    Button playAgain;
    TextView wrongAnsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playagain);
        playAgain = (Button) findViewById(R.id.playAgainButton);
        wrongAnsText = (TextView)findViewById(R.id.wrongAns);

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayAgain.this, MainGameActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/shablagooital.ttf");
        playAgain.setTypeface(typeface);
        wrongAnsText.setTypeface(typeface);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
