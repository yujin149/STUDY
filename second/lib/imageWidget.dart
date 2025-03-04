import 'package:flutter/material.dart';




class ImageWidgetApp extends StatefulWidget {
  const ImageWidgetApp({super.key});

  @override
  State<ImageWidgetApp> createState() => _ImageWidgetAppState();
}

class _ImageWidgetAppState extends State<ImageWidgetApp> {
  @override
  Widget build(BuildContext context) {

    return Scaffold(
      appBar: AppBar(title: Text('Image Widget'),),
      body: Container(
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Image.asset('image/dal.jpg', width:200, height:280, fit:BoxFit.fill), //이미지 불러 오는 코드
              Text('Flutter 너무 쉬워요',
                style : TextStyle(fontFamily: '나눔손글씨 다시 시작해', fontSize: 30, color:Colors.blue),
              )

            ],
          ),
        ),
      ),
    );
  }
}
