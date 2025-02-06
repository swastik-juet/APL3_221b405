class Kaurav extends Bharatvanshi {
    boolean isObedient;
    boolean isKind;

    public Kaurav(String name, boolean isObedient, boolean isKind) {
        super(name);
        this.isObedient = isObedient;
        this.isKind = isKind;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting fiercely!");
    }

    public void obey() {
        if (isObedient) {
            System.out.println(name + " is obeying the rules!");
        } else {
            System.out.println(name + " is disobeying the rules!");
        }
    }

    public void kind() {
        if (isKind) {
            System.out.println(name + " is kind!");
        } else {
            System.out.println(name + " is cruel!");
        }
    }
}
