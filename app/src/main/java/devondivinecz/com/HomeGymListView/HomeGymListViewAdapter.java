package devondivinecz.com.HomeGymListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import devondivinecz.com.R;

public class HomeGymListViewAdapter extends ArrayAdapter<HomeGymList> {

    public HomeGymListViewAdapter(@NonNull Context context, ArrayList<HomeGymList> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);

            TextView title = convertView.findViewById(R.id.equipment);
            title.setText(getItem(position).getEquipment());
        }

        return convertView;
    }
}
