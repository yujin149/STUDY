import 'package:flutter/material.dart';
import 'package:firebase_example/memoPage.dart';
import 'package:firebase_core/firebase_core.dart';
import 'firebase_options.dart';
import 'package:firebase_messaging/firebase_messaging.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(
    options: DefaultFirebaseOptions.currentPlatform,
  );
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: FutureBuilder(
        future: Firebase.initializeApp(), //선언해야 할 함수
        builder: (context, snapshot) {
          if (snapshot.hasError) {
            //만약 선언 시 에러가 나면 출력될 위젯
            return Center(child: Text('Error'));
          }
          //선언 완료 후 표시할 위젯
          if (snapshot.connectionState == ConnectionState.done) {
            _initFirebaseMessaging(context);
            _getToken();
            return MemoPage();
          }
          //선언되는 동안 표시할 위젯
          return Center(child: CircularProgressIndicator());
        },
      ), //메모 관리 화면
    );
  }

  _initFirebaseMessaging(BuildContext context) {
    FirebaseMessaging.onMessage.listen((RemoteMessage event) {
      print(event.notification!.title);
      print(event.notification!.body);
      showDialog(
        context: context,
        builder: (BuildContext context) {
          return AlertDialog(
            title: Text("알림"),
            content: Text(event.notification!.body!),
            actions: [
              TextButton(
                child: Text("OK"),
                onPressed: () {
                  Navigator.of(context).pop();
                },
              ),
            ],
          );
        },
      );
    });
    FirebaseMessaging.onMessageOpenedApp.listen(
      (RemoteMessage message) {},
    );
  }
}

_getToken() async{
  FirebaseMessaging messaging = FirebaseMessaging.instance;
  print("messageing.getToken(), ${await messaging.getToken()}");
}