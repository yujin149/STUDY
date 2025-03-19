// 함수 정의
/*printInteger(int aNumber){
  print ('The number is $aNumber.' ); // 콘솔에 출력
}

// int ? -> null 값을 넣을 수 있음
int? couldReturnNullButDoesnt() => -3;

//main() 함수에서 시작
main(){
  var number = 42; //동적 타입 변수 지정
  printInteger(number); //함수 호출

  int? couldBeNullButIsnt = 1; //null로 변경 가능
  List<int?> listThatCouldHoldNulls = [2,null,4]; //List의 int에 null 값 포함 가능
  List<int>? nullsList;  //List 자체가 null일 수 있음
  int a = couldBeNullButIsnt; // null을 넣으면 오류
  //int b = listThatCouldHoldNulls.first; //int b는 ?가 없으므로 오류
  int b = listThatCouldHoldNulls.first!; //null이 아님을 직접표시
  //int c = couldReturnNullButDosent().abs(); //null일 수도 있으므로 abs()에서 오류 //abs는 절대값
  int c = couldReturnNullButDoesnt()!.abs(); //null이 아님을 직접 표시

  print('a is $a.');
  print('b is $b.');
  print('c is $c.');
}
*/

/*
void main() async{
  checkVersion();
  await getVersionName().then((value) => {
    print(value)
  });
  print('end process');
}
Future<String> getVersionName()async{
  var versionName = await lookUpVersionName();
  return versionName;
}

String lookUpVersionName(){
  return 'Android Q';
}

Future checkVersion() async{
  var version = await lookUpVersion();
  print(version);
}

int lookUpVersion(){
  return 12;
}

 */

/*
void printOne(){
  print('One');
}
void printTwo() async{
  await Future.delayed(Duration(seconds: 1), (){
    print('Future!!');
  });
  print('Two');
}

void printThree(){
  print('Three');
}

void main(){
  printOne();
  printTwo();
  printThree();
}

 */
/*
import 'dart:convert';

void main(){
  //‘’’ ‘’’ 는 문자열인데 문자열 그대로 인식
  // “hello\nworld” 라고 한다면
  //
  // ‘’’
  // hello
  // world
  // ’’’
  var jsonString = '''
  [
  {"score" : 40},
  {"score" : 80}
  ]
  ''';

  var scores = jsonDecode(jsonString);
  print(scores is List); //List니까 true
  var firstScore = scores[0];
  print(firstScore is Map); //Map이니까 true
  print(firstScore['score'] == 40);

  //List <Map>
  var scores1 = [
    {'score' : 40},
    {'score' : 80},
    {'score' : 100, 'overtime' :true, 'special_gust':null}
  ];

  var jsonText = jsonEncode(scores1); //List -> json
  //print(jsonText);
  //줄바꿈, 공백도 없어야 true가 나온다.
  print(jsonText =='[{"score":40},{"score":80},{"score":100,"overtime":true,"special_gust":null}]'); //true
}


 */
/*
import 'dart:convert';

Future<int> sumStream(Stream<int> stream) async{
  var sum = 0;
  await for(var value in stream){
    print('sumStream : $value');
    sum += value;
  }
  return sum;

}
//async * 명령어는 yield를 이용해 지속적으로 데이터를 전달하겠다는 의미
Stream<int> countStream(int to) async*{
  for(int i = 1; i<=to; i++){
    print('countStream : $i');
    yield i; //이것 때문에, stream / sum이 번갈아가면서 나온다.
  }
}

main() async{
  var stream = countStream(10);
  var sum = await sumStream(stream);
  print(sum); //55

  //Stream.fromIterable은 Iterable을 사용하여 Stream을 생성하는 메서드
  var stream1 = Stream.fromIterable([1,2,3,4,5]);

  //가장 앞의 데이터 결과 : 1
  stream1.first.then((value) => print('first : $value'));
  //가장 마지막 데이터 결과 : 5
  stream1.last.then((value) => print('last : $value'));
  //현재 스트림이 비어 있는지 확인 : false
  stream1.isEmpty.then((value) => print('isEmpty : $value'));
  // 전체 길이 : 5
  stream1.length.then((value) => print('length : $value'));
}

 */

import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyApp();
}

class _MyApp extends State<MyApp> {
  var switchValue = false;
  String test = 'hello';
  Color _color = Colors.blue;

  Widget build(BuildContext context) {
    //MaterialApp 앱으로서 기능을 할 수 있는 뼈대
    //Scaffold 앱에서 디자인적인 부분 X 뼈대

    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity:
            VisualDensity.adaptivePlatformDensity,
        colorScheme: ColorScheme.dark(),
      ),
      darkTheme: ThemeData.light(),
      home: Scaffold(
        body: Center(
          child: Column(
            //여러가지 데이터가 들어갈 수 있으므로, children이 됨.
            children: [
              Switch(
                value: switchValue,
                onChanged: (value) {
                  setState(() {
                    print(value);
                    switchValue =
                        value; // switch 값 변경
                  });
                }),
              ElevatedButton(
                child: Text('$test'),
                style : ButtonStyle(
                  backgroundColor: MaterialStateProperty.all(_color),
                ),
                onPressed: (){
                  if(test == 'hello'){
                    setState((){
                      test = 'flutter';
                      _color = Colors.orange;
                    });
                  }else{
                    setState((){
                      test = 'hello';
                      _color = Colors.blue;
                    });
                  }
                },
              ),
            ],
          ),
        ),
      ),
    );
  }
}
