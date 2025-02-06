class Pandav extends Bharatvanshi {
    boolean isKind;
    boolean isObedient;

    public Pandav(String name, boolean isKind, boolean isObedient) {
        super(name);
        this.isKind = isKind;
        this.isObedient = isObedient;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting with valor!");
    }

    public void obey() {
        if (isObedient) {
            System.out.println(name + " is obeying the rules!");
        } else {
            System.out.println(name + " is not obeying the rules!");
        }
    }

    public void kind() {
        if (isKind) {
            System.out.println(name + " is kind!");
        } else {
            System.out.println(name + " is not that kind.");
        }
    }
}
