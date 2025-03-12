import 'package:flutter/material.dart';
import 'package:mysql_client/mysql_client.dart';

void main() {
  dbConnector();
  runApp(const MyApp());
}

Future<void> dbConnector() async {
  print("Connecting to mysql server..");
  //MySQL 접속
  final conn = await MySQLConnection.createConnection(
    host: '192.168.0.37',
    port: 3306,
    userName: 'root',
    password: '1234',
    databaseName: 'testdb',
  );
  //연결 대기
  await conn.connect();

  print('Connected');

  //1.추가
/*
  var res = await conn.execute(
    "INSERT INTO testtbl VALUES (:a, :b)",
    {
      "a":4,
      "b":"호랑이",
    }
  );
*/


  //2.수정
  /*
  var res = await conn.execute(
    "UPDATE testtbl SET name = :a where name = '호랑이'",
    {
      "a" : "사슴",
    }
  );

   */
  /*
  var res = await conn.execute(
      "UPDATE testtbl SET name = :a where name = ':b'",
      {
        "a" : "사슴",
        "b" : "호랑이",
      }
  );
*/
  //3.삭제
  //await conn.execute("delete from testtbl where name = :a",{"a":"고양이"});
  
  //4.탐색-1 (전체)
  /*
  var res = await conn.execute("select * from testtbl");
  for(final row in res.rows){
    print(row.colAt(0)); //행의 인덱스 정보 출력
    print(row.colByName("name"));
    print(row.assoc());
  }

   */
  //5.탐색-2 (조건문)
  var res = await conn.execute(
    "select * from testtbl where id = :a",
    {
      "a" : 4,
    }
  );

  //종료 대기
  await conn.close();
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'MySQL DEMO',
      home: Scaffold(body: Center(child: Text('Hello'),
      ),
      ),
    );
  }
}
