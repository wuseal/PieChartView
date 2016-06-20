# PieChartView
####饼状图图形报表控件，可自行设定多种参数

<img src="https://github.com/wuseal/PieChartView/blob/master/demo.png?raw=true" alt="alt text" width="540" height="960">

##使用方法，将PieChartView类和attr_pie_chart_view.xml文件直接拷贝到工程下，然后直接在xml布局中使用既可
```xml
      <com.dahanis.piechart.PieChartView
              android:id="@+id/pie_chart"
              android:layout_width="match_parent"
              android:layout_height="400dp"
              android:background="#ccc"
              android:paddingBottom="40dp"
              android:paddingLeft="20dp"
              app:circleRadius="100dp"
              app:textSize="13sp" />

```

* circleRadius:饼状图的半径
* textSize:指示文字的大小


##java类中的使用

```java
        PieChartView pieChartView = (PieChartView) findViewById(R.id.pie_chart);

        List<PieChartView.PieceDataHolder> pieceDataHolders = new ArrayList<>();

        pieceDataHolders.add(new PieChartView.PieceDataHolder(100,0xFF77CCAA, "今天，１"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(1000, 0xFF11AA33, "明天，２"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(1200, Color.GRAY, "就是风，３"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(5000, Color.YELLOW, "呵呵，４"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(10000, Color.RED, "小京，５"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(13000, Color.BLUE, "花花，６"));

        pieChartView.setData(pieceDataHolders);
```
