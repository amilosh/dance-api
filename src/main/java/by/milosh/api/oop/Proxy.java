package by.milosh.api.oop;

public class Proxy {

    private boolean[] proxySequence;

    public Proxy() {
    }

    public boolean[] getProxySequence() {
        return proxySequence;
    }

    public void setProxySequence(boolean[] proxySequence) {
        this.proxySequence = proxySequence;
    }

    public void initProxySequence(int[] sequence) {
        boolean[] proxy = new boolean[sequence.length];
        for (boolean bool : proxy) {
            bool = false;
        }
        this.proxySequence = proxy;
    }
}
