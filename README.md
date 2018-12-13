# dexcount-checker
See how dex method count increases in Android coding

## So how it works

### Variables
* Normal variable doesn't increase count, for eg: `String x = 1`
* Static final variable doesn't increase count, for eg: `static final dev = false`
* Static Non final variable increase method count by 1, for eg: `static dev = false`
