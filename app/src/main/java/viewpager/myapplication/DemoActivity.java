package viewpager.myapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class DemoActivity extends AppCompatActivity {
    private ViewPager vpSmile;
    private ArrayList<face> listFace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        initData();
        initView();




    }
    public void initData(){
        listFace=new ArrayList<>();
        listFace.add(new face("#2196F3",R.drawable.i2,"Face Smile"));
        listFace.add(new face("#009688",R.drawable.images,"Face Smile"));
        listFace.add(new face("#FFC107",R.drawable.images1,"Face Smile"));
        listFace.add(new face("#F2196F3",R.drawable.images2,"Face Smile"));
    }
    public void initView(){

        vpSmile= findViewById(R.id.vp_smile);
        SmileAdapter adapter=new SmileAdapter(this,listFace);

        vpSmile.setAdapter(adapter);

     }
}
