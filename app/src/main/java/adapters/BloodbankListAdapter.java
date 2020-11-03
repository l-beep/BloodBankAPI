package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.lovineoduor.bloodbankapi.R;
import com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi.BloodBank;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public abstract class BloodbankListAdapter<blood> extends RecyclerView.Adapter<BloodbankListAdapter.RestaurantViewHolder> {
    private List<blood> mBloodbank;
    private Context mContext;

    public void BloodBankListAdapter(Context context, List<blood> restaurants, List<blood> bloodbank) {
        mContext = context;
        mBloodbank = bloodbank;
    }

    public  <BloodBankViewHolder> BloodBankViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donate_list_item, parent, false);
        BloodBankViewHolder viewHolder = new BloodBank() {
            @Override
            public Call<BloodBank> getBlood(String donate, String request) {
                return null;
            }
        } ViewHolder(view);
        return viewHolder;
    }

    protected abstract void ViewHolder(View view);


    @Override
    public void onBindViewHolder(BloodbankListAdapter.RestaurantViewHolder holder, int position) {
        holder.bindRestaurant(mBloodbank.get(position));
    }

    @Override
    public int getItemCount() {
        return mBloodbank.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.restaurantImageView)
        ImageView mRestaurantImageView;
        @BindView(R.id.restaurantNameTextView) TextView mNameTextView;
        @BindView(R.id.categoryTextView)
        TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;
        private Context mContext;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindRestaurant(blood restaurant) {
            mNameTextView.setText(restaurant.getName());
            mCategoryTextView.setText(restaurant.getCategories().get(0).getTitle());
            mRatingTextView.setText("Rating: " + restaurant.getRating() + "/5");
        }

    }
}