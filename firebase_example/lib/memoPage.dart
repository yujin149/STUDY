import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';
import 'package:firebase_database/firebase_database.dart';
import 'memo.dart';
import 'memoAdd.dart';

class MemoPage extends StatefulWidget {
  @override
  State<MemoPage> createState() => _MemoPageState();
}

class _MemoPageState extends State<MemoPage> {
  FirebaseDatabase? _database;
  DatabaseReference? reference;
  String _databaseURL =
      'https://example-edca8-default-rtdb.firebaseio.com/';
  List<Memo> memos = new List.empty(growable: true);

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    _database = FirebaseDatabase.instanceFor(
      app: Firebase.app(),
      databaseURL: _databaseURL,
    );
    reference = _database!.ref('memo');
    reference!.onChildAdded.listen((event) {
      print(event.snapshot.value.toString());
      setState(() {
        memos.add(Memo.fromSnapshot(event.snapshot));
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('메모앱')),
      body: Container(
        child: Center(
          child:
              memos.length == 0
                  ? CircularProgressIndicator()
                  : GridView.builder(
                    gridDelegate:
                        SliverGridDelegateWithFixedCrossAxisCount(
                          crossAxisCount: 2,
                        ),
                    itemBuilder: (context, index) {
                      return Card(
                        child: GridTile(
                          child: Container(
                            padding: EdgeInsets.only(
                              top: 20,
                              bottom: 20,
                            ),
                            child: SizedBox(
                              child: GestureDetector(
                                onTap: () {},
                                onLongPress: () {},
                                child: Text(memos[index].content),
                              ),
                            ),
                          ),
                          header: Text(memos[index].title),
                          footer: Text(
                            memos[index].createTime.substring(0, 10),
                          ),
                        ),
                      );
                    },
                    itemCount: memos.length,
                  ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.of(context).push(
            MaterialPageRoute(
              builder: (context) => MemoAddPage(reference!),
            ),
          );
        },
        child: Icon(Icons.add),
      ),
    );
  }
}
