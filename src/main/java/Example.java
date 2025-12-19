import org.objectweb.asm.ClassReader;

class Example {
    @Deprecated
    static void example(String className) throws Exception {
        new ClassReader(className);
    }
}
