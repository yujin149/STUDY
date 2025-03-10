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
