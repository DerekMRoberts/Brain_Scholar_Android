package brainscholar.brainscholar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private int speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar C = (SeekBar) findViewById(R.id.c);
        SeekBar GNA = (SeekBar) findViewById(R.id.gna);
        SeekBar GK = (SeekBar) findViewById(R.id.gk);
        SeekBar BETA = (SeekBar)findViewById(R.id.beta);
        SeekBar GAMMA = (SeekBar) findViewById(R.id.gamma);
        SeekBar V_STIM = (SeekBar) findViewById(R.id.v_stim);

        GNA.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    TextView text_SeekBar = (TextView) findViewById(R.id.textGNAprogress);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        int val = (progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / seekBar.getMax();
                        text_SeekBar.setText("" + progress/10.0);
                        text_SeekBar.setX(seekBar.getX() + val + seekBar.getThumbOffset() / 2);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.GONE);
                    }
                }
        );

        GK.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    TextView text_SeekBar = (TextView) findViewById(R.id.textGKprogress);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        int val = (progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / seekBar.getMax();
                        text_SeekBar.setText("" + progress/10.0);
                        text_SeekBar.setX(seekBar.getX() + val + seekBar.getThumbOffset() / 2);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.GONE);
                    }
                }
        );

        BETA.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    TextView text_SeekBar = (TextView) findViewById(R.id.textBETAprogress);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        int val = (progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / seekBar.getMax();
                        text_SeekBar.setText("" + progress/10.0);
                        text_SeekBar.setX(seekBar.getX() + val + seekBar.getThumbOffset() / 2);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.GONE);
                    }
                }
        );

        GAMMA.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    TextView text_SeekBar = (TextView) findViewById(R.id.textGAMMAprogess);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        int val = (progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / seekBar.getMax();
                        text_SeekBar.setText("" + progress/10.0);
                        text_SeekBar.setX(seekBar.getX() + val + seekBar.getThumbOffset() / 2);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.GONE);
                    }
                }
        );

        V_STIM.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    TextView text_SeekBar = (TextView) findViewById(R.id.textV_STIMprogress);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        int val = (progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / seekBar.getMax();
                        text_SeekBar.setText("" + progress/10.0);
                        text_SeekBar.setX(seekBar.getX() + val + seekBar.getThumbOffset() / 2);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.GONE);
                    }
                }
        );

        C.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    TextView text_SeekBar = (TextView) findViewById(R.id.textCprogress);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        int val = (progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / seekBar.getMax();
                        text_SeekBar.setText("" + progress/1000.0);
                        text_SeekBar.setX(seekBar.getX() + val + seekBar.getThumbOffset() / 2);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_SeekBar.setVisibility(View.GONE);
                    }
                }
        );

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.speed_arrays, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(MainActivity.this);

        Button calcButton = (Button) findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View vw) {
                SeekBar C = (SeekBar) findViewById(R.id.c);
                SeekBar GNA = (SeekBar) findViewById(R.id.gna);
                SeekBar GK = (SeekBar) findViewById(R.id.gk);
                SeekBar BETA = (SeekBar)findViewById(R.id.beta);
                SeekBar GAMMA = (SeekBar) findViewById(R.id.gamma);
                SeekBar V_STIM = (SeekBar) findViewById(R.id.v_stim);

                double c = C.getProgress();
                c = c/1000;

                double gna = GNA.getProgress();
                gna = gna/10;

                double gk = GK.getProgress();
                gk = gk/10;

                double beta = BETA.getProgress();
                beta = beta/10;

                double gamma = GAMMA.getProgress();
                gamma = gamma/10;

                double v_stim = V_STIM.getProgress();
                v_stim = v_stim/10;


                Intent intent = new Intent(MainActivity.this, FullscreenActivity.class);
                intent.putExtra("speed", speed);
                intent.putExtra("c", c);
                intent.putExtra("gna", gna);
                intent.putExtra("gk", gk);
                intent.putExtra("beta", beta);
                intent.putExtra("gamma", gamma);
                intent.putExtra("v_stim", v_stim);
                startActivity(intent);


            }
        });
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                speed = 1;
                break;
            case 1:
                speed = 2;
                break;
            case 2:
                speed = 3;
                break;
            case 3:
                speed = 4;
                break;
            case 4:
                speed = 5;
                break;

        }
        System.out.println();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        speed = 2;

    }


}
