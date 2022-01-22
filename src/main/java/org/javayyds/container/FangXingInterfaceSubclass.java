package org.javayyds.container;

//public class FangXingInterfaceSubclass<String> implements FangXingInterface<String> {
//    // 占位符String,作用等于B/A/E/T
//    @Override
//    public String test() {
////        return "abc";
//        return null;
//    }
//
//    @Override
//    public void test2(String string) {
//        System.out.println(string);
//    }
//}

public class FangXingInterfaceSubclass implements FangXingInterface<String> {
    // 占位符String,作用等于B/A/E/T
    @Override
    public String test() {
        return "abc";
    }

    @Override
    public void test2(String string) {
        System.out.println(string);
    }
}
