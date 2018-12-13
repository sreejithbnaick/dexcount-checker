# dexcount-checker
See how dex method count increases in Android coding

## So how it works

### Variables
* Normal variable doesn't increase count, for eg: `String x = 1`.
* Static final variable doesn't increase count, for eg: `static final boolean dev = false`.
* Static Non final variable increase method count by 1, for eg: `static boolean dev = false`.

### Interface class
* Interface definition doesn't increase count.
    ```
    public interface TestInterface1 {
     }
     ```
* Interface implementation increase count by 1.
    ```
    private TestInterface1 testInterface1 = new TestInterface1() {

         };
         ```
* Each method definition will increase method count by 1.
    ```
    public interface TestInterface2 {
         public void test(); // 1 method count for this.
     }
     ```

### Abstract Class
* Abstract Definition increments count by 1.
    ```
    public abstract class TestAbstract {
     }
     ```
* Each method definition (abstract/non-abstract) will increase method count by 1.
    ```
    public abstract class TestAbstract1 {
         public abstract void test(); // 1 method count for this.
     }
     ```
* Each class implementation will take extra 1.
    ```
    private TestAbstract testAbstract = new TestAbstract() {
         };
    ```
* Each method abstract/non-abstract overridden method will take extra 1.
    ```
    private TestAbstract1 abstract1 = new TestAbstract1() {
             @Override
             public void test() {
             }
         };
     ```

     or

     ```
     private TestAbstract2 abstract2 = new TestAbstract2() {
              @Override
              public void test() {
                 // This will take another method count.
              }

              @Override
              public void test2() {
                  super.test2();
                  // This will take another method count.
              }

          };
     ```
