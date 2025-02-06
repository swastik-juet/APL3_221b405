class Vikarn extends Kaurav {
    public Vikarn(String name) {
        super(name, true, true);  
    }

    @Override
    public void obey() {
        System.out.println(name + " is obeying the rules!");
    }

    @Override
    public void kind() {
        System.out.println(name + " is kind!");
    }
}