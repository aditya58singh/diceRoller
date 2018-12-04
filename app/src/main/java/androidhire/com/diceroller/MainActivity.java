package androidhire.com.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewdice;
    private ImageView imageViewdice2;
    private Random randomnumber = new Random();
    private Button buttonroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewdice = findViewById(R.id.imageView1);
        imageViewdice2 = findViewById(R.id.imageView2);

        buttonroll = findViewById(R.id.rolldicebtn);
        buttonroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldice();
                rolldice2();
            }
        });

    }

    private void rolldice() {
        int myrand = randomnumber.nextInt(6) + 1;

        switch (myrand) {
            case 1:
                imageViewdice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewdice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewdice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewdice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewdice.setImageResource(R.drawable.dice4);
                break;
            case 6:
                imageViewdice.setImageResource(R.drawable.dice5);
                break;
            case 7:
                imageViewdice.setImageResource(R.drawable.dice6);
                break;
        }

    }

    private void rolldice2() {
        int myrand = randomnumber.nextInt(6) + 1;

        switch (myrand) {
            case 1:
                imageViewdice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewdice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewdice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewdice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewdice2.setImageResource(R.drawable.dice4);
                break;
            case 6:
                imageViewdice2.setImageResource(R.drawable.dice5);
                break;
            case 7:
                imageViewdice2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
