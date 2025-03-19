package Day14;

interface K {
    void abc();

}

interface R {
    void xxx();
}

class YOU implements K, R {
    public void abc() {

    }

    public void xxx() {

    }
}

interface Q extends K {
    void def();
}

abstract class Y implements Q {
    public void def() {

    }

    abstract void kor();
}

class XXXO {

}

class XOR extends XXXO implements K, R {
    public void abc() {

    }

    @Override
    public void xxx() {

    }
}

class KOR extends Y {
    public void abc() {

    }

    void kor() {

    }
}

public class InterfaceTest {

}
