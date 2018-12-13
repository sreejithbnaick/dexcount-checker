package in.codesmell.dex;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    // Doesn't take method count, nothing happens
    public int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    // comment this to reduce count, by 1
    private void test() {
        Logger.log("test", "test");
    }

    // comment this to reduce count, by 1. Just for class implementation
    private TestInterface1 testInterface1 = new TestInterface1() {

    };

    // comment this to reduce count, by 2. One for class, other for method
    private TestInterface2 testInterface2 = new TestInterface2() {

        @Override
        public void test() {
            // Cant comment this. Comment on class definition, to reduce by 1
        }
    };

    // comment this to reduce count, by 3. One for class, 2 for methods
    private TestInterface3 testInterface3 = new TestInterface3() {
        @Override
        public void test1() {

        }

        @Override
        public void test2() {

        }
    };
}
