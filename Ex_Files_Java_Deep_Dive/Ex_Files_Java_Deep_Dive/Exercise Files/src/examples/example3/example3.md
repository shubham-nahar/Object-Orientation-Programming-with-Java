# Static

- Fixed to a Class so it cannot be personalized by any instance of that class. 

# Static Method

-  If Static is in front of a method, you dont need an instance to invoke it.

# Static in Main

- The Main Method needs to be static because it's the starting point for Java.

# Accessing Static Method in Other Class:

- ClassName.MethodName()

# Important

- Static Data Belongs to the Class Itself, Rather than to its Instance.

# Static In Main Method

- It is because it is the entry point to every Java Application.

- You cannot make a Static reference to the Non-Static Method. That is If the Method is non Static it cannot be called in static method. Given Below is Quick Fix for the same.

### Quick Fix

1. Do Not Change the Method to Static.
2. Create an Instance of the Class in the Main Method and then Call the method. eg: new Class().methodName()


