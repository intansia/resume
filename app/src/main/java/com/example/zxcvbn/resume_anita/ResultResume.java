package com.example.zxcvbn.resume_anita;

/**
 * Created by zxcvbn on 19/07/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ResultResume extends Activity {

    ListView grdData;
    private static final class Holder{
        public TextView tvName;
        public TextView tvCollege;
        public TextView tvPhone;
        public TextView tvEmail;
        public TextView tvProfile;
        public TextView tvEducation;
        public TextView tvTechnical;
        public TextView tvAchievement;
        public TextView tvRelated;
        public TextView tvInternship;
    }
    public ResultResume(){}

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultresume);

        grdData=(ListView) findViewById(R.id.grdData);
        ControllerResume myData=new ControllerResume(this);
        myData.open();
        myData.getData();

        HasilResumeAdapter adapter=new HasilResumeAdapter(this, android.R.layout.simple_list_item_1, myData.getData());
        grdData.setAdapter(adapter);
        myData.close();
    }

    private class HasilResumeAdapter extends ArrayAdapter<ModelResume>{
        private LayoutInflater mInflater;
        public HasilResumeAdapter(Context context, int textViewResourceId, List<ModelResume> objects){
            super(context, textViewResourceId, objects);
            //TODO Auto-generated constructor stub
            mInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            View view=convertView;
            Holder holder;
            if(view==null){
                //View doesn't exist so create it and create the holder
                view=mInflater.inflate(R.layout.custom_resultresume, parent, false);
                holder=new Holder();
                holder.tvName=(TextView) view.findViewById(R.id.tvName);
                holder.tvCollege=(TextView) view.findViewById(R.id.tvCollege);
                holder.tvPhone=(TextView) view.findViewById(R.id.tvPhone);
                holder.tvEmail=(TextView) view.findViewById(R.id.tvEmail);
                holder.tvProfile=(TextView) view.findViewById(R.id.tvProfile);
                holder.tvEducation=(TextView) view.findViewById(R.id.tvEducation);
                holder.tvTechnical=(TextView) view.findViewById(R.id.tvTechnical);
                holder.tvAchievement=(TextView) view.findViewById(R.id.tvAchievement);
                holder.tvRelated=(TextView) view.findViewById(R.id.tvRelated);
                holder.tvInternship=(TextView) view.findViewById(R.id.tvInternship);

                view.setTag(holder);
            }else{
                //Just get our existing holder
                holder=(Holder) view.getTag();
            }
            //Populate via the holder for speed
            ModelResume stream=getItem(position);
            //Populate the item contents
            //holder.ivCurrency.setBackgroundResource(view.getResource().getIdentifier(stream.getMataUang().toLowerCase(), "drawable", view.getContext().getPackageName()));
            holder.tvName.setText(stream.getName());
            holder.tvCollege.setText(stream.getCollege());
            holder.tvPhone.setText(stream.getPhone());
            holder.tvEmail.setText(stream.getEmail());
            holder.tvProfile.setText(stream.getProfile());
            holder.tvEducation.setText(stream.getEducation());
            holder.tvTechnical.setText(stream.getTechnicalskill());
            holder.tvAchievement.setText(stream.getAchivement());
            holder.tvRelated.setText(stream.getRelatedcourse());
            holder.tvInternship.setText(stream.getInternship());

            return view;
        }
    }
}
