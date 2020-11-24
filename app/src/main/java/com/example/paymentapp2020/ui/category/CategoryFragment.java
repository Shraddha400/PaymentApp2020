package com.example.paymentapp2020.ui.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentapp2020.R;

import java.util.ArrayList;


public class CategoryFragment extends Fragment {
    private SearchView searchView;
    private RecyclerView recyclerView_category,recyclerView_housings,recyclerView_acessories,recyclerView_electronics;

    private CategoryViewModel categoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoryViewModel =
                ViewModelProviders.of(this).get(CategoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_category, container, false);
//        final TextView textView = root.findViewById(R.id.text_category);
//        categoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        recyclerView_category=root.findViewById(R.id.Categories_recycler);
        ArrayList<ModelCategoryDisplay> itemlist=new  ArrayList<>();
        itemlist.add(new ModelCategoryDisplay(R.drawable.ic_baseline_home_24,"Housings"));
        itemlist.add(new ModelCategoryDisplay(R.drawable.ic_baseline_add_shopping_cart_24,"Personal Accessories"));
        itemlist.add(new ModelCategoryDisplay(R.drawable.ic_baseline_important_devices_24,"Electronic"));
        itemlist.add(new ModelCategoryDisplay(R.drawable.ic_baseline_directions_car_24,"Housings"));
        itemlist.add(new ModelCategoryDisplay(R.drawable.ic_baseline_sports_cricket_24,"Housings"));
        AdapterForAllCategory adapterCategoryDisplay = new AdapterForAllCategory(itemlist,getContext());
        recyclerView_category.setAdapter(adapterCategoryDisplay);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_category.setLayoutManager(linearLayoutManager);
        searchView=root.findViewById(R.id.searchViewCategory);

        recyclerView_housings=root.findViewById(R.id.Housing_categories_recycler);
        ArrayList<ModelForHousings> housingList= new ArrayList<>();
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));

        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        housingList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        AdapterForHousings adapterForHousings = new AdapterForHousings(housingList,getContext());
        recyclerView_housings.setAdapter(adapterForHousings);

        LinearLayoutManager linearLayoutManagerHOUSING = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_housings.setLayoutManager(linearLayoutManagerHOUSING);

        recyclerView_acessories=root.findViewById(R.id.Old_accessory_categories_recycler);
        ArrayList<ModelForHousings> acessoriesList= new ArrayList<>();
        acessoriesList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));

        acessoriesList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        acessoriesList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        acessoriesList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        acessoriesList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        acessoriesList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        acessoriesList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        acessoriesList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        acessoriesList.add(new ModelForHousings(R.drawable.dining,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        AdapterForHousings adapterForHousingsacessories = new AdapterForHousings(acessoriesList,getContext());
        recyclerView_acessories.setAdapter(adapterForHousingsacessories);

        LinearLayoutManager linearLayoutManagerAcessories= new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_acessories.setLayoutManager(linearLayoutManagerAcessories);






        recyclerView_electronics=root.findViewById(R.id.Elect_categories_recycler);
        ArrayList<ModelForHousings> electList= new ArrayList<>();
        electList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));

        electList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        electList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        electList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));
        electList.add(new ModelForHousings(R.drawable.spfa,
                "Green Villa","Rs 94,00000",
                "Used for 5 years",
                "Location: Kathmandu","7 Bed Rooms","4 Toilets","6 Balcony","2 Big Terrece",false));

        AdapterForHousings adapterForHousingselectric = new AdapterForHousings(acessoriesList,getContext());
        recyclerView_electronics.setAdapter(adapterForHousingselectric);

        LinearLayoutManager linearLayoutManagerelectronic= new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_electronics.setLayoutManager(linearLayoutManagerelectronic);


        return root;
    }
}