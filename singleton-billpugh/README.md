# Singleton Pattern (Bill Pugh)
The Bill Pugh Singleton uses a static inner helper class to create the instance. This is a very elegant way to achieve thread-safety without using 'synchronized'. The instance is only created when the 'getInstance' method is called, because the helper class is only loaded then.
