package utcc.nontchaiyakarn.admissionnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by nontchaiyakarn on 9/27/15 AD.
 */
public class MyAdapter extends BaseAdapter {

    // ประกาศตัวแปร
    private Context objContext;
    private String[] imgString, subjectString, typeString, dateString;

    public MyAdapter(Context objContext, String[] subjectString, String[] typeString, String[] dateString) {
        this.objContext = objContext;
        this.imgString = imgString;
        this.subjectString = subjectString;
        this.typeString = typeString;
        this.dateString = dateString;
    }

    @Override
    public int getCount() {
        return subjectString.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup,false);

        // For Subject
        TextView subjectTextView = (TextView) view1.findViewById(R.id.txtSubject);
        subjectTextView.setText(subjectString[i]);

        // For Type
        TextView typeTextView = (TextView) view1.findViewById(R.id.txtType);
        typeTextView.setText(typeString[i]);

        // For Date
        TextView dateTextView = (TextView) view1.findViewById(R.id.txtDate);
        dateTextView.setText(imgString[i]);

        // For IMG
        //ImageView imgImageView = (ImageView) view1.findViewById(R.id.imageView);
        //Picasso.with(objContext).load(imgString[i]).into(imgImageView);


        return view1;
    }   // Method getView

}   // Main Class
