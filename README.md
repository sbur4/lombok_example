# CONFIG

* Java 8
* Gradle 8
* Intellij Idea Community

## INFO

* Folder 'libs' for the jars to use offline

### LIBS

```
- AccessLevel.PUBLIC/PROTECTED/PRIVATE/PACKAGE/MODEL/NONE;
- @Data = class NON FINAL / all-req / eq+hc+ts / Does not make fields final / Generates setters and getters.
 No getters/setters are generated for static fields and no setters generate for final fields.
- @Value = class FINAL /  all cons / eq+hc+ts  / Makes all non-static fields final / No setters generate for any filed
 as it makes all fields final except static fields, and obviously no getters generate for static fileds.
```

TODO @Delegate doesn't work