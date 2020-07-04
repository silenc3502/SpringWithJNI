package proj.nativeinterface.test;

public class HelloSpring {
    public native String print();

    static {
        System.loadLibrary("hello");
    }
}
