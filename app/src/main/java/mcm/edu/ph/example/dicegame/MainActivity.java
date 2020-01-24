package mcm.edu.ph.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    public static final Random rng = new Random();
    private Button rolldie;
    private Timer timer = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rolldie = (Button) findViewById(R.id.rolldie);
        imageViewDice = findViewById(R.id.image_view_dice);

        rolldie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();

                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                imageViewDice.startAnimation(rotate
                );
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.one);
                rolldie.setEnabled(false);

                Timer buttonTimer = new Timer();
                buttonTimer.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldie.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.two);
                rolldie.setEnabled(false);

                Timer buttonTimer2 = new Timer();
                buttonTimer2.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldie.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.three);
                rolldie.setEnabled(false);

                Timer buttonTimer3 = new Timer();
                buttonTimer3.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldie.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.four);
                rolldie.setEnabled(false);

                Timer buttonTimer4 = new Timer();
                buttonTimer4.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldie.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.five);
                rolldie.setEnabled(false);

                Timer buttonTimer5 = new Timer();
                buttonTimer5.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldie.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.six);
                rolldie.setEnabled(false);

                Timer buttonTimer6 = new Timer();
                buttonTimer6.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                rolldie.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                break;
        }
    }
}


