package net.info420.fabien.dronetravailpratique.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import net.info420.fabien.dronetravailpratique.R;

/**
 * Created by fabien on 17-02-15.
 */

public class ObjectifsActivity extends Activity {

  public static final String TAG = ObjectifsActivity.class.getName();

  private Button mBtnObj1Step1;
  private Button mBtnObj1Step2;
  private Button mBtnObj1Step3;
  private Button mBtnObj2Step1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    initUI();

    Log.d(TAG, "onCreate()");
  }

  private void initUI(){
    setContentView(R.layout.objectifs_activity);

    mBtnObj1Step1 = (Button) findViewById(R.id.btn_obj1_step1);
    mBtnObj1Step2 = (Button) findViewById(R.id.btn_obj1_step2);
    mBtnObj1Step3 = (Button) findViewById(R.id.btn_obj1_step3);
    mBtnObj2Step1 = (Button) findViewById(R.id.btn_obj2_step1);

    mBtnObj1Step1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), Obj1Etape1Activity.class));
      }
    });

    mBtnObj1Step2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), Obj1Etape2Activity.class));
      }
    });

    mBtnObj1Step3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), Obj1Etape3Activity.class));
      }
    });

    mBtnObj2Step1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), Obj2Etape3Activity.class));
      }
    });
  }
}