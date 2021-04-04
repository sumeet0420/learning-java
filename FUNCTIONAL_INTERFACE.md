# FUNCTIONAL INTERFACES

## 6 BASIC FUNCTIONAL INTERFACES

1. UnaryOperator  -------------> T apply (T t)
2. BinaryOperator -------------> T apply (T t1, Tt2)
3. Function       -------------> R apply (T t)
4. Consumer       -------------> void accept (T t)
5. Predicate      -------------> boolean test (T t)
6. Supplier       -------------> T get ()

## Each of these 6 Basic Interfaces have 3 Primitive Support Type Functional Interfaces

7. IntUnaryOperator
8. LongUnaryOperator
9. DoubleUnaryOperator
10. IntBinaryOperator
11. LongBinaryOperator
12. DoubleBinaryOperator
13. IntFunction
14. LongFunction
15. DoubleFunction
16. IntConsumer
17. LongConsumer
18. DoubleConsumer
19. IntPredicate
20. LongPredicate
21. DoublePredicate
22. Intupplier
23. LongSupplier
24. DoubleSupplier

## All FunctionInterfaces have 9 more variants
#### If both the source and result are of primitive, Prefix Function with ToResult (6 Interfaces)
25. IntToLongFunction
26. IntToDoubleFunction
27. LongToInFunction
28. LongToDoubleFunction
29. DoubleToIntFunction
30. DoubleToLongFunction
#### Three with Obj
31. IntToObjFunction
32. DoubleToObjFunction
33. LongToObjFunction
## 3 two argument Basic Function
34. BiPredicate<T, U> 
35. BiConsumer<T, U>
36. BiFunction<T, U, R>
#### 3 Primitive Types BiFunction
37. ToIntBiFunction<T, U>
38. ToLongBiFunction<T, U>
39. ToDoubleBiFunction<T, U>
#### Consumer That takes One Object Reference and one primitive type 
40. ObjDoubleConsumer<T>
41. ObjIntConsumer<T> 
42. ObjLongConsumer<T>

43

