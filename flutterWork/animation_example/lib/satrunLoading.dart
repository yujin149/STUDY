import 'package:flutter/material.dart';
import 'dart:math';

class SaturnLoading extends StatefulWidget {
  _SaturnLoading _saturnLoading = _SaturnLoading();

  @override
  State<StatefulWidget> createState() => _saturnLoading;

  void start(){
    _saturnLoading.start();

    void stop(){
      _saturnLoading.stop();
    }
  }
}

class _SaturnLoading extends State<SaturnLoading>
    with SingleTickerProviderStateMixin {
  AnimationController? _animationController;
  Animation? _animation;

  void initState() {
    super.initState();
    _animationController = AnimationController(
      vsync: this,
      duration: Duration(seconds: 3),
    );
    _animation = Tween<double>(
      begin: 0,
      end: pi * 2,
    ).animate(_animationController!);
    _animationController!.repeat();
  }

  void dispose() {
    _animationController!.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return AnimatedBuilder(
      animation: _animationController!,
      builder: (context, child) {
        return SizedBox(
          width: 100,
          height: 100,
          child: Stack(
            children: <Widget>[
              Image.asset(
                'repo/circle.png',
                width: 100,
                height: 100,
              ),
              Center(
                child: Image.asset(
                  'repo/sunny.png',
                  width: 30,
                  height: 30,
                ),
              ),
              Padding(
                padding: EdgeInsets.all(5),
              child: Transform.rotate(
                angle: _animation!.value,
                origin: Offset(35, 35),
                child: Image.asset(
                  'repo/saturn.png',
                  width:20,
                  height:20,
                ),
              ),
              ),
            ],
          ),
        );
      },
    );
  }

  void stop(){
    _animationController!.stop(canceled: true);
  }
  void start(){
    _animationController!.repeat();
  }
}
