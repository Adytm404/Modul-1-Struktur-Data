
public class Segitiga<A, T>  {

    private A a;
    private T t;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Segitiga(A a, T t){
        setA(a);
        setT(t);
    }

    public int hitungInteger(){
        return (int) getA() * (int) getT() / 2;
    }

    public double hitungDouble(){
        return (double)getA() * (double)getT() / 2;
    }
}
