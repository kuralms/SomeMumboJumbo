package killbit.taskrabbit.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import killbit.taskrabbit.R;
import killbit.taskrabbit.retrofit.inbox.MessageList;

/**
 * Created by kural mughil selvam on 15-10-2017.
 */

public class inbox_adapter extends RecyclerView.Adapter<inbox_adapter.MyViewHolder>{

    private List<MessageList> ListDatas;
    Context context;
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    OnRecyclerListener recyclerListener;
    MessageList listData;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_adp_rew_name,tv_adp_rew_description
                ,tv_adp_rew_date;

        ImageView iv_review_pic1;
        Button btn_tasker_adp_rate;
        LinearLayout ll_rev1;
        RatingBar rbr1;



        public MyViewHolder(View view, Context context) {
            super(view);


            iv_review_pic1=view.findViewById(R.id.iv_adp_rew_pic);

            ll_rev1=view.findViewById(R.id.ll_rev1);

            tv_adp_rew_name=view.findViewById(R.id.tv_adp_rew_name);

            rbr1=view.findViewById(R.id.rattingbar);

            tv_adp_rew_description=view.findViewById(R.id.tv_adp_rew_description);

            tv_adp_rew_date=view.findViewById(R.id.tv_adp_rew_date);

        }
    }


    public inbox_adapter(List<MessageList> ListData, Context context, OnRecyclerListener recyclerListener) {

        this.ListDatas = ListData;
        this.context = context;
        this.recyclerListener= recyclerListener;


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adp_reviews, parent, false);

        return new MyViewHolder(itemView, context);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder,  int position) {
         listData = ListDatas.get(position);






    }



    public interface OnRecyclerListener {
        void onInboxItemSelected(int position, String tasker_id, String Profile_pic, String RatePerHr, String TaskerName);

    }

    @Override
    public int getItemCount() {
        return ListDatas.size();
    }



}
