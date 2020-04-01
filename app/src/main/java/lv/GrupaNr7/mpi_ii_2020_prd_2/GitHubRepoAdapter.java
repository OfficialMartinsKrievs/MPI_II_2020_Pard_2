package lv.GrupaNr7.mpi_ii_2020_prd_2;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

/**
 * Created by RaamKumr on 3/9/2017.
 */
public class GitHubRepoAdapter extends ArrayAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<GitHubRepo> list;

    GitHubRepoAdapter(Context context, int resource, List<GitHubRepo> objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(inflater == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null)
        {
            view = inflater.inflate(R.layout.list_item,null);
        }
        TextView name = (TextView)view.findViewById(R.id.textview);


        GitHubRepo gitHubRepo = list.get(position);
        if(name != null)
        {
            String value = "www.github.com/martinssekmigais/";
            name.setText(Html.fromHtml(value)+gitHubRepo.getName());
            name.setMovementMethod(LinkMovementMethod.getInstance());
            //name.setText(gitHubRepo.getName());
        }

        return view;
    }

}
