import 'package:flutter/material.dart';

class Cal extends StatelessWidget {
  Widget build(BuildContext context) {
    return _Cal();
  }
}

class _Cal extends StatefulWidget {
  @override
  State<_Cal> createState() => _CalState();
}

class _CalState extends State<_Cal> {
  String sum = '';
  TextEditingController value1 = TextEditingController();
  TextEditingController value2 = TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Widget Example')),
      body: Container(
        child: Center(
          child: Column(
            children: <Widget>[
              Padding(
                padding: EdgeInsets.all(15),
                child: Text(
                  '결과 : $sum',
                  style: TextStyle(fontSize: 20),
                ),
              ),
              Padding(
                padding: EdgeInsets.only(left: 20, right: 20),
                child: TextField(keyboardType: TextInputType.number, controller: value1,),
              ),
              Padding(
                padding: EdgeInsets.only(left: 20, right: 20),
                child: TextField(keyboardType: TextInputType.number, controller: value2,),
              ),
              Padding(
                padding: EdgeInsets.all(15),
                child: ElevatedButton(
                  child: Row(
                    children: <Widget>[
                      Icon(Icons.add),
                      Text('더하기')
                    ],
                  ),
                  style: ButtonStyle(backgroundColor: MaterialStateProperty.all(Colors.amber)),
                  onPressed: (){
                    setState(() {
                      int result = int.parse(value1.value.text) + int.parse(value2.value.text);
                      sum = '$result';
                    });
                  },
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
