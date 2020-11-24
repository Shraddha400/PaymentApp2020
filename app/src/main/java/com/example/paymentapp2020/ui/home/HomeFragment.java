package com.example.paymentapp2020.ui.home;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentapp2020.MainActivity;
import com.example.paymentapp2020.MovableProductsAddPost;
import com.example.paymentapp2020.R;
import com.example.paymentapp2020.SQLiteHelper;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
//  recyclerView_post=findViewById(R.id.recycler_view_posts);
    //    List<ModelRe> itemList;
//ListView mListView;
    ArrayList<ModelRe> mList;

SQLiteHelper sqLiteHelper;
    ImageView imageViewIcon;

    public HomeFragment() {

    }

//private HomeViewModel homeViewModel;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mList = new ArrayList<>();
        sqLiteHelper = new SQLiteHelper(getContext(),"TASKDB.sqlite",null,1);
        Cursor cursor = sqLiteHelper.getData(" SELECT * FROM TASK ");
        mList.clear();
        try{
            while (cursor.moveToNext())
            {
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                String price = cursor.getString(2);
                String phone = cursor.getString(3);
                String usedTime = cursor.getString(4);
                String deliverycharge = cursor.getString(5);
                String deliveryplace = cursor.getString(6);
                String dates = cursor.getString(7);
                byte[] image = cursor.getBlob(8);
                //add to List

                mList.add(new ModelRe(id, name, price, phone,usedTime,deliverycharge,deliveryplace,dates, image));
            }


            if (mList.size() == 0) {
                //if there is no record in the table of the database which means list view is empoty
                // Toast.makeText(HomeFragment.this, "No record found", Toast.LENGTH_SHORT).show();
            }

        }catch(Exception e){
            e.printStackTrace();

        }




    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        recyclerView=view.findViewById(R.id.recycler_view_post);
        RecyclerProductAdapter adapter = new RecyclerProductAdapter(mList,getContext());
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;

//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });


//        return root;


   //typecasting recycler view

   //recyclerView_post.setHasFixedSize(true);
//   recyclerView_post.setLayoutManager(new LinearLayoutManager(getContext()));
//   recyclerView_post.setAdapter(new RecyclerProductAdapter(initData()));
//        ArrayList<ModelRe> list = new ArrayList<>();
//        RecyclerProductAdapter adapter = new RecyclerProductAdapter(this,R.layout.row_items,list);
       // recyclerView_post.setAdapter(adapter);

//        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
       // recyclerView.setLayoutManager(layoutManager);

        //re = findViewById(R.id.listview);



        //get all data from sqlite





        //list.add(new ModelRe(0,R.drawable.ic_action_name,"MOBILE","RS: 1000","876543212","NEW","100"," ALL AROUND","ALWAYS",false));


        //get all data from sqlite
       // Database_Products_Movable database_products_movable = new Database_Products_Movable(getActivity());

//        Cursor cursor = MovableProductsAddPost.database_products_movable.getData(" SELECT * FROM PRODUCTS ");
//        list.clear();
//        while(cursor.moveToNext()){
//            int id = cursor.getInt(0);
//            byte[] image = cursor.getBlob(1);
//            String name = cursor.getString(2);
//            String price = cursor.getString(3);
//            String phone = cursor.getString(4);
//            String usedTime = cursor.getString(5);
//            String deliverycharge = cursor.getString(6);
//            String place = cursor.getString(7);
//            String date = cursor.getString(8);
//            //add to arraylist
//            list.add(new ModelRe(id,image,name,price,phone,usedTime,deliverycharge,place,date,false));
//        }

//        adapter.notifyDataSetChanged();
//        if (list.size() == 0){
//            //if the is no record table of database which means list is empty
//          //  Toast.makeText(this,"No Record Found",Toast.LENGTH_LONG).show();
//
//        }


//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView_post.setLayoutManager(staggeredGridLayoutManager);

        //        LinearLayoutManager layoutManager= new LinearLayoutManager(getContext());
//        recyclerView_post.setLayoutManager(layoutManager);
//        LinearLayoutManager layoutManager= new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
//        recyclerView_post.setLayoutManager(layoutManager);

    }


//    public List<ModelRe> initData() {
//    itemList=new ArrayList<>();
//    itemList.add(new ModelRe(R.drawable.vr,"Rachid ","1000000","Delivery charge:100","Used 2 years","Available Only Inside City","Offer Till:15 Days",false));
//        itemList.add(new ModelRe(R.drawable.phone,"Mobile","5000","Delivery charge:100","Used 2 years","Available Only Inside City","Offer Till:15 Days",false));
//        itemList.add(new ModelRe(R.drawable.spfa,"Sofa","50000","Delivery charge:100","Used 2 years","Available Only Inside City","Offer Till:15 Days",false));
//        itemList.add(new ModelRe(R.drawable.cardisp,"Car","50000","Delivery charge:100","Used 2 years","Available Only Inside City","Offer Till:15 Days",false));
//
//        return itemList;
//    }


     }