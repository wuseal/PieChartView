package com.dahanis.piechart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_pie_chart_view);

        PieChartView pieChartView = (PieChartView) findViewById(R.id.pie_chart);

        List<PieChartView.PieceDataHolder> pieceDataHolders = new ArrayList<>();

        pieceDataHolders.add(new PieChartView.PieceDataHolder(100,0xFF77CCAA, "今天，１"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(1000, 0xFF11AA33, "明天，２"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(1200, Color.GRAY, "就是风，３"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(5000, Color.YELLOW, "呵呵，４"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10000, Color.RED, "小京，５"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(13000, Color.BLUE, "花花，６"));

        pieChartView.setData(pieceDataHolders);

    }
}
