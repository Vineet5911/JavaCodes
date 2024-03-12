package oops;

public class destroyers {
    public static void main(String[] args) {
        nw objct;
        for(int i = 0; i < 1000000000; i++){
            objct = new nw("kuch to hoga hi pta nhi ");
        }
    }
    public static class nw{
        String name;
        public nw(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object ko hta diya hai bhai ");;
        }
    }
}
