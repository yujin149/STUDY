import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'SubPage Example',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      initialRoute: '/',
      routes: {'/' : (context) => FirstPage(),
      '/second':(context)=>SecondPage()},
    );
  }
}

class FirstPage extends StatefulWidget {
  State<StatefulWidget> createState() => _FirstPage();
}

class _FirstPage extends State<FirstPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Sub Page Main'),
      ),
      body: Container(
        child: Center(
          child:Text('첫 번째 페이지'),
        ),
      ),floatingActionButton:FloatingActionButton(
      onPressed: () {
        /*/Navigator.of(context)
            .push(MaterialPageRoute(builder:(context) => SecondPage())); //이게중요
        */
        Navigator.of(context).pushNamed('/second');
      },
      child: Icon(Icons.add),
    ),
    );
  }
}

class SecondPage extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title:Text('Second Page'),
      ),
      body: Container(
        child: Center(
          child: ElevatedButton(onPressed: (){},
              child: Text('돌아가기'),
          ),
        ),
      ),
    );
  }
}


