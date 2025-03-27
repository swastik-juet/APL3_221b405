class Whiskey extends Beverages {
    @Override
    protected void addContiment() {
        System.out.println("Add Ice in it");
    }

    @Override
    protected void stir() {
        System.out.println("Stir it for 30 sec");
    }
}