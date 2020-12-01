package com.example.first;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ItemViewHolder> implements ItemTouchHelperListener{
    ArrayList<exercise_list> items = new ArrayList<>();


    public ListAdapter(){
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater를 이용해서 원하는 레이아웃을 띄워줌
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.basket_list, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        //ItemViewHolder가 생성되고 넣어야할 코드들을 넣어준다.
        holder.onBind(items.get(position));
        holder.set_num.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(holder.set_num.getText().toString().length()>0) {
                    items.get(holder.getAdapterPosition()).set_set(Integer.parseInt(holder.set_num.getText().toString()));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(exercise_list e_list){
        items.add(e_list);
    }

    @Override
    public boolean onItemMove(int from_position, int to_position) {

        //이동할 객체 저장
        exercise_list e_list = items.get(from_position);

        //이동할 객체 삭제
        items.remove(from_position);

        //이동하고 싶은 position에 추가
        items.add(to_position, e_list);

        //Adapter에 데이터 이동알림
        notifyItemMoved(from_position, to_position);

        return true;
    }

    @Override
    public void onItemSwipe(int position) {
        items.remove(position);
        notifyItemRemoved(position);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView exercise_name;
        EditText set_num;
        public ItemViewHolder(View itemView) {
            super(itemView);
            exercise_name = itemView.findViewById(R.id.exercise_name);
            set_num = itemView.findViewById(R.id.set_num);
        }

        public void onBind(exercise_list e_list) {
            exercise_name.setText(e_list.get_name());
            set_num.setText(String.valueOf(e_list.get_set()));
        }
    }
}


