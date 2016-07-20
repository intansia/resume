package com.example.zxcvbn.resume_anita;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
public class MainActivity extends AppCompatActivity {

    Context myContext;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myContext=getApplicationContext();
        progress=ProgressDialog.show(MainActivity.this, "Please Wait...", "Download Data", true);
        RESTClient.get().getHasilResume(new Callback<ResponseResume>(){
            @Override
            public void failure(RetrofitError error){
                //TODO Auto-generated method stub
                progress.dismiss();
                Toast.makeText(getApplicationContext(), "FAILED ..."+error.getMessage(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void success(ResponseResume hasilres, Response response){
                //TODO Auto-generated method stub
                if(hasilres.getHasilResume().size()>0){
                    ControllerResume chb=new ControllerResume(myContext);
                    chb.open();
                    chb.deleteData();
                    for(int y=0; y<hasilres.getHasilResume().size(); y++){
                        ModelResume tmpHasil=hasilres.getHasilResume().get(y);
                        chb.insertData(tmpHasil.getName(), tmpHasil.getCollege(), tmpHasil.getPhone(), tmpHasil.getEmail(),
                                tmpHasil.getProfile(), tmpHasil.getEducation(), tmpHasil.getTechnicalskill(),
                                tmpHasil.getAchivement(), tmpHasil.getRelatedcourse(), tmpHasil.getInternship());
                    }
                    chb.close();
                    Intent sendIntent=new Intent(myContext, ResultResume.class);
                    startActivity(sendIntent);
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "DATA SEDANG TIDAK TERSEDIA", Toast.LENGTH_LONG).show();
                }
                progress.dismiss();
            }
        });
    }

}
