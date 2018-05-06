package viewpager.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 28-Jan-18.
 */

public class SmileAdapter extends PagerAdapter {
    private ArrayList<face> listFace;
    private LayoutInflater inflater;
    public SmileAdapter(Context context,ArrayList<face> listFace) {
        this.listFace = listFace;
        inflater= LayoutInflater.from(context);
    }

    @Override

    public int getCount() {
        return listFace.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //1.chuyen xml thanh view
        View view=inflater.inflate(R.layout.item_simle,container,false);
        //2.anh xa view
        LinearLayout lnContainer=view.findViewById(R.id.ln_container);
        ImageView ivFace=view.findViewById(R.id.iv_icon);
        TextView tvname=view.findViewById(R.id.tv_name);

        //3.Đổ dữ liệu
        face face=listFace.get(position);
        lnContainer.setBackgroundColor(Color.parseColor(face.getColor()));
        ivFace.setImageResource(face.getFaceId());
        tvname.setText(face.getName());

        //4.them vao container
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((View) object);
    }
}
