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
        // No affect
        test();

        // No affect
        regularClass.x = 2;
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

    // comment this to reduce count by 1. Another for implementation.
    private TestAbstract testAbstract = new TestAbstract() {
    };

    // comment this to reduce count by 1. Extra 1 for implementation.
    private TestAbstract1 abstract1 = new TestAbstract1() {
        @Override
        public void test() {
            // This will take another method count.
            // Total 2 extra for implementation.
        }
    };

    // comment this to reduce count by 1. Extra 1 for implementation.
    private TestAbstract2 abstract2 = new TestAbstract2() {
        @Override
        public void test() {
            // This will take another method count.
        }

        @Override
        public void test2() {
            super.test2();
            // This will take another method count.
            // comment this to reduce count by 1.
        }

        // So total 3, one for implementation,
        // another for abstract method and
        // another for overridden method.
    };

    // Doesn't take any count.
    private RegularClass regularClass = new RegularClass();

    private RegularClass1 regularClass1 = new RegularClass1() {
        // This will take another method count.
    };

    private RegularClass1 regularClass2 = new RegularClass1() {
        @Override
        public void test() {
            super.test();
            // This will take another method count.
            // comment this to reduce count by 1.
        }
    };
}
