import 'package:flutter/material.dart';
import 'package:http/http.dart' as http; //http 패키지 불러오기
import 'dart:convert';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(home: HttpApp());
  }
}

class HttpApp extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _HttpApp();
}

class _HttpApp extends State<HttpApp> {
  String result = '';
  List? data;

  void initState() {
    super.initState();
    data = new List.empty(growable: true);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Http Example')),
      body: Container(
        child: Center(
          child:
              data!.length == 0
                  ? Text(
                    '데이터가 없습니다.',
                    style: TextStyle(fontSize: 20),
                    textAlign: TextAlign.center,
                  )
                  : ListView.builder(
                    itemBuilder: (context, index) {
                      return Card(
                        child: Container(
                          child: Column(
                            children: <Widget>[
                              Text(data![index]['title'].toString()),
                              Text(
                                data![index]['authors'].toString(),
                              ),
                              Text(
                                data![index]['sale_price'].toString(),
                              ),
                              Text(data![index]['status'].toString()),
                              Image.network(
                                data![index]['thumbnail'],
                                height: 100,
                                width: 100,
                                fit: BoxFit.contain,
                              ),
                            ],
                          ),
                        ),
                      );
                    },
                    itemCount: data!.length,
                  ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () async {
          getJSONData();
        },
        child: Icon(Icons.file_download), //내려 받는 모양의 아이콘 표시
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }

  Future<String> getJSONData() async {
    var url =
        'https://dapi.kakao.com/v3/search/book?target=title&query=doit';
    var response = await http.get(
      Uri.parse(url),
      headers: {
        "Authorization": "KakaoAK f39d78349657ef560e80adddffab6bd0",
      },
    ); //카카오에서 발급받은 rest api 키 넣기
    //print(response.body); 검색 결과 로그창으로 확인
    //return "Successfull";

    setState(() {
      var dataConvertedToJSON = json.decode(response.body);
      List result = dataConvertedToJSON['documents'];
      data!.addAll(result);
    });

    return response.body;
  }
}
