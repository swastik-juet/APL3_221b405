abstract class Beverages {
    protected void pour(int amt) {
        System.out.println("Pour " + amt + " ml of Beverage in glass");
    }

    abstract void addContiment();

    protected void stir() {
        System.out.println("Stir the beverage");
    }

    protected void serve() {
        System.out.println("Serve it by the waiter");
    }

    public void templeteMethod(int amt) {
        pour(amt);
        addContiment();
        stir();
        serve();
    }
}