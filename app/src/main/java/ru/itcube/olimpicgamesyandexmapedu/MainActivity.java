package ru.itcube.olimpicgamesyandexmapedu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.mapview.MapView;

public class MainActivity extends AppCompatActivity {
    private final String API_KEY="de92c462-d5a7-461a-a1ad-efd8774b1108";
    private MapView yandexMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Инициализируем карты
        MapKitFactory.setApiKey(API_KEY);
        MapKitFactory.initialize(this);
        setContentView(R.layout.activity_main);

        yandexMap = findViewById(R.id.yandex_map);
    }

    @Override
    protected void onStop() {
        super.onStop();
        yandexMap.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        yandexMap.onStart();
        MapKitFactory.getInstance().onStart();
    }
}