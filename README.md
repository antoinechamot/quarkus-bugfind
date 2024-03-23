# Simple project to reproduce a bug

Simple project to reproduce a bug on detached entity merge with inheritance

Project contains only 2 entities :
  - shape
  - circle

Database is pre-populate with 3 circles with following attributes
  - id 
  - name : 'My circle'
  - surname : 'My surname'
  - color : 'red'

## Running the tests

You can run tests => one must fail corresponding to the problematic case:
```shell script
./mvnw test
```

