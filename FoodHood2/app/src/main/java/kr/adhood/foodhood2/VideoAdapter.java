package kr.adhood.foodhood2;

/**
 * Created by Hyun on 2016-01-11.
 * Adapter for New ArrayList
 */

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;

public class VideoAdapter extends ArrayAdapter<VideoInfo> {

    private ArrayList<VideoInfo> items;

    public VideoAdapter (Context context, int textViewResourceId, ArrayList<VideoInfo> _items) {
        super(context, textViewResourceId, _items);

        this.items = _items;
    }

    public Filter getFilter() {
        return new Filter() {

            protected FilterResults performFiltering(CharSequence constraint) {
                final FilterResults ret = new FilterResults();
                final ArrayList<VideoInfo> results = new ArrayList<VideoInfo>();

                if(constraint != null) {
                    if(items != null & items.size() > 0) {
                        for(final VideoInfo v : items) {
                            results.add(v);
                        }
                    }
                }

                ret.values = results;
                ret.count = results.size();

                return ret;
            }

            protected void publishResults(CharSequence constraint, FilterResults results) {
                notifyDataSetChanged();
            }
        };
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        v = vi.inflate(R.layout.content_a1_main, null);
        TextView name = (TextView) v.findViewById(R.id.a1_id);
        TextView distance = (TextView) v.findViewById(R.id.a1_dist);

        VideoInfo temp = items.get(position);
        Log.d("getView items", String.valueOf(items.size()));
        Log.d("getView position", String.valueOf(position));

        if (temp != null) {
            if (name != null) {
                name.setText(temp.getName());
            }

            if (distance != null) {
                distance.setText("300m");
            }
        }

        return v;
    }
}
