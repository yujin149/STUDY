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
  TextEditingController? _editingController;
  ScrollController? _scrollController;
  int page = 1;

  void initState() {
    super.initState();
    data = new List.empty(growable: true);
    _editingController = new TextEditingController();

    _scrollController = new ScrollController();

    _scrollController!.addListener(() {
      if (_scrollController!.offset >=
          _scrollController!.position.maxScrollExtent &&
          !_scrollController!.position.outOfRange) {
        print('bottom');
        page++;
        getJSONData();
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: TextField(
          controller: _editingController,
          style: TextStyle(color: Colors.black),
          keyboardType: TextInputType.text,
          decoration: InputDecoration(hintText: '검색어를 입력하세요'),
        ),
      ),
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
            controller: _scrollController,
          ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          page = 1;
          data!.clear();
          getJSONData();
        },
        child: Icon(Icons.file_download), //내려 받는 모양의 아이콘 표시
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }

  Future<String> getJSONData() async {
    var url =
        'https://dapi.kakao.com/v3/search/book?target=title&page=$page&query=${_editingController!
        .value.text}';
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
