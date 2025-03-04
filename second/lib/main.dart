import 'package:flutter/material.dart';
import 'package:second/imageWidget.dart';
import 'package:second/calWidget.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Material Flutter App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      // home: MaterialFlutterApp(),
      home: Cal(),
    );
  }
}

class MaterialFlutterApp extends StatefulWidget {
  State<StatefulWidget> createState() {
    return _MaterialFlutterApp();
  }
}

class _MaterialFlutterApp
    extends State<MaterialFlutterApp> {
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Material Flutter App',
      theme : ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: ImageWidgetApp(),
    );
    /*
    return Scaffold(
      appBar: AppBar(
        title: Text('Meterial Design App'),
      ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.add),
        onPressed: () {},
      ),
      body: Container(
        child: Center(
          child: Column(
            children: <Widget>[
              Icon(Icons.android),
              Text('android'),
              ImageWidgetApp(),
            ],
            mainAxisAlignment:
                MainAxisAlignment
                    .center, // 세로로 정렬해주는 코드
          ),
        ),
      ),
    );

     */
  }
}
