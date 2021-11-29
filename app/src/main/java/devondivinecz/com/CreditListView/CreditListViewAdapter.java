package devondivinecz.com.CreditListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import devondivinecz.com.HomeGymListView.HomeGymList;
import devondivinecz.com.R;

public class CreditListViewAdapter extends ArrayAdapter<CreditList> {

    public CreditListViewAdapter(@NonNull Context context, ArrayList<CreditList> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);

            TextView name = convertView.findViewById(R.id.list);
            name.setText(getItem(position).getName());
        }

        return convertView;
    }
}
