/*
 * Nadya Salsabilah
 * 13020210302
 */
package central0302;
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0302 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0302 obj = new Central0302 ();
        System.out.println("main");
        obj.aaa();
    }
}

