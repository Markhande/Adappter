package apna_package_one;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.temp_for_adapter.R;

public class Adapter extends BaseAdapter {
    Context context;
    int[] animal_array;
    LayoutInflater inflater;
    public Adapter(Context context, int[] animal_array) {
        this.context = context;
        this.animal_array = animal_array;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animal_array.length;
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
        view=inflater.inflate(R.layout.image_view,null);
        ImageView imageView= view.findViewById(R.id.image_view);
        imageView.setBackgroundResource(animal_array[i]);
        return imageView;
    }
}
